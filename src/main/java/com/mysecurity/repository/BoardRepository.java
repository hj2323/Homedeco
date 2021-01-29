package com.mysecurity.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysecurity.dto.Board;
import com.mysecurity.mapper.BoardMapper;

@Repository
public class BoardRepository {
@Autowired
private BoardMapper boardMapper;

	public void insert(Board board) {
		boardMapper.boardInsert(board);
	}
	
	public List<Board> list() {
		return boardMapper.list();
	}
}
