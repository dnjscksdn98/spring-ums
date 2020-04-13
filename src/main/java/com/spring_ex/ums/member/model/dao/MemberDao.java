package com.spring_ex.ums.member.model.dao;

import java.util.List;

import com.spring_ex.ums.member.model.dto.MemberDto;

public interface MemberDao {
	
	public List<MemberDto> memberList();  // 회원 목록
	
	public void insertMember(MemberDto dto);  // 회원 추가
	
	public MemberDto viewMember(String userId);  // 회원 정보 상세 보기
	
	public void deleteMember(String userId);  // 회원 삭제
	
	public void updateMember(MemberDto dto);  // 회원 정보 수정
	
	public boolean checkPw(String userId, String userPw);
}
