package com.mysecurity.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysecurity.dto.AuthDTO;
import com.mysecurity.dto.Board;
import com.mysecurity.dto.MemberDTO;
import com.mysecurity.mapper.BoardMapper;
import com.mysecurity.mapper.MemberMapper;

@Repository
public class MemberRepository {
	@Autowired
	private MemberMapper memberMapper;

	public void userJoin(MemberDTO member) {
		memberMapper.memberJoin(member);
	}

	public void userAuth(AuthDTO auth) {
		memberMapper.authJoin(auth);
	}
	
	public MemberDTO  findById(String userid) {
		return memberMapper.findById(userid);
	}
	//È¸¿øº¯°æ
	public void update(MemberDTO member) {
		memberMapper.update(member);
	}
	//È¸¿øÅ»Åð
	public void memberDelete(String userid) {
		memberMapper.memberDelete(userid);
	}
	public void authDelete(String userid) {
		memberMapper.authDelete(userid);
	}
}
