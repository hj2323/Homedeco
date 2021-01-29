package com.mysecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysecurity.dto.AuthDTO;
import com.mysecurity.dto.MemberDTO;
import com.mysecurity.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Transactional
	public void join(MemberDTO member, AuthDTO auth) {
		//비밀번호 암호화
	//	member.getUserpw(); //  암호화 전
		member.setUserpw(passwordEncoder.encode(member.getUserpw()));
		memberRepository.userJoin(member);
		memberRepository.userAuth(auth);
	}
	// 회원정보
	public MemberDTO findById(String userid) {
		return memberRepository.findById(userid);
	}
	//회원변경
	public void update(MemberDTO member) {
		//비번 암호화시키기
		member.setUserpw(passwordEncoder.encode(member.getUserpw()));
		memberRepository.update(member);
	}
	//회원탈퇴
	@Transactional
	public void delete(String userid) {
		memberRepository.memberDelete(userid);
		memberRepository.authDelete(userid);
	}

}
