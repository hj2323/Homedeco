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
		//��й�ȣ ��ȣȭ
	//	member.getUserpw(); //  ��ȣȭ ��
		member.setUserpw(passwordEncoder.encode(member.getUserpw()));
		memberRepository.userJoin(member);
		memberRepository.userAuth(auth);
	}
	// ȸ������
	public MemberDTO findById(String userid) {
		return memberRepository.findById(userid);
	}
	//ȸ������
	public void update(MemberDTO member) {
		//��� ��ȣȭ��Ű��
		member.setUserpw(passwordEncoder.encode(member.getUserpw()));
		memberRepository.update(member);
	}
	//ȸ��Ż��
	@Transactional
	public void delete(String userid) {
		memberRepository.memberDelete(userid);
		memberRepository.authDelete(userid);
	}

}
