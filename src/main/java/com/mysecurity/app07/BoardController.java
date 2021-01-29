package com.mysecurity.app07;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mysecurity.dto.Board;
import com.mysecurity.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService bservice;
	@GetMapping("insert")
	@PreAuthorize("isAuthenticated()")
	public void insert() {

	}
	
	@PostMapping("boardInsert")
	@PreAuthorize("isAuthenticated()")
	public String insert(Board board, HttpServletRequest request) throws IOException {
		String saveDir = request.getSession().getServletContext().getRealPath("/");
		saveDir += "resources\\img\\";
		MultipartFile f = board.getUploadFile();
		String fileName="";
		if(!f.isEmpty()) {
			String orifileName = f.getOriginalFilename();  //a.jpg
			//파일명 지정
			UUID  uuid= UUID.randomUUID();
			fileName = uuid+"_"+orifileName;  //111112222_a.jpg
		//	f.transferTo(new File(saveDir+fileName));
			FileCopyUtils.copy(f.getBytes(), new File(saveDir+fileName));
			board.setBimg(fileName);
		}
		bservice.insert(board);
		return "redirect:list";
	}
	@GetMapping("list")
	public String list(Model model) {
		model.addAttribute("boards", bservice.list());
		return "board/list";
	}

}
