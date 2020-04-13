package com.spring_ex.ums.member.model.dao;

import java.util.List;

import com.spring_ex.ums.member.model.dto.MemberDto;

public interface MemberDao {
	
	public List<MemberDto> memberList();  // ȸ�� ���
	
	public void insertMember(MemberDto dto);  // ȸ�� �߰�
	
	public MemberDto viewMember(String userId);  // ȸ�� ���� �� ����
	
	public void deleteMember(String userId);  // ȸ�� ����
	
	public void updateMember(MemberDto dto);  // ȸ�� ���� ����
	
	public boolean checkPw(String userId, String userPw);
}
