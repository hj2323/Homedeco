package com.mysecurity.mapper;

import com.mysecurity.dto.AuthDTO;
import com.mysecurity.dto.MemberDTO;

public interface MemberMapper {
	public MemberDTO read(String userid);
	// member join
	 public void memberJoin(MemberDTO member);
	//auth join
	 public void authJoin(AuthDTO  auth);
	 
	 public void update(MemberDTO member);
	 //회원정보
	 public MemberDTO findById(String userid);
	 public void memberDelete(String userid);
	 public void authDelete(String userid);

}
