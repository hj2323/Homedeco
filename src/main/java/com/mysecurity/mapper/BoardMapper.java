package com.mysecurity.mapper;

import java.util.List;

import com.mysecurity.dto.Board;

public interface BoardMapper {
//±Û¾²±â
	public void boardInsert(Board board); 
	
	public List<Board> list();
}
