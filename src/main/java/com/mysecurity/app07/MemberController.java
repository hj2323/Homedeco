package com.mysecurity.app07;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.tribes.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.CookieClearingLogoutHandler;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysecurity.dto.AuthDTO;
import com.mysecurity.dto.MemberDTO;
import com.mysecurity.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired MemberService mservice;

	@GetMapping("insert")
	public String insert() {
		return "member/join";
	}
	@PostMapping("join")
	public String join(MemberDTO member, AuthDTO auth) {
		auth.setAuth("ROLE_"+auth.getAuth());
		System.out.println("auth : "+auth.getAuth());
		mservice.join(member, auth);
		return null;
	}
	//회원수정폼으로 가기
	@GetMapping("update")
	public void update(Principal principal,  Model model) {
		String userid = principal.getName();
		MemberDTO member =  mservice.findById(userid);
		model.addAttribute("member", member);
	}
	
	@PostMapping("update")
	public String update(MemberDTO member,HttpSession session) {
		mservice.update(member);
		session.invalidate();
		return "redirect:/";
	}
	@GetMapping("delete")  // 이거 DeletMapping  으로 
	public String delete(Principal principal, HttpServletRequest request,
			HttpServletResponse response ) {
		Authentication auth 
		   = SecurityContextHolder.getContext().getAuthentication();
			mservice.delete(principal.getName());
		if(auth!=null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
			return "redirect:/";
	}
}






