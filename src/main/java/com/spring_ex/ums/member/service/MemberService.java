package com.spring_ex.ums.member.service;

import java.util.List;

import com.spring_ex.ums.member.model.dto.MemberDto;

public interface MemberService {
	
	public List<MemberDto> memberList();
	
	public void insertMember(MemberDto dto);
	
	public MemberDto viewMember(String userId);
	
	public void deleteMember(String userId);
	
	public void updateMember(MemberDto dto);
	
	public boolean checkPw(String userId, String userPw);
}
