package com.mysecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysecurity.dto.Board;
import com.mysecurity.repository.BoardRepository;

@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	public void insert(Board board) {
		boardRepository.insert(board);
	}
	
	public List<Board> list() {
		return boardRepository.list();
	}
	

}
