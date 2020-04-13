package com.spring_ex.ums.member.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring_ex.ums.member.model.dao.MemberDaoImpl;
import com.spring_ex.ums.member.model.dto.MemberDto;


@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDaoImpl memberDao;
	
	@Override
	public List<MemberDto> memberList() {
		return memberDao.memberList();
	}
	
	@Override
	public void insertMember(MemberDto dto) {
		memberDao.insertMember(dto);
	}
	
	@Override
	public MemberDto viewMember(String userId) {
		return memberDao.viewMember(userId);
	}
	
	@Override
	public void deleteMember(String userId) {
		memberDao.deleteMember(userId);
	}
	
	@Override
	public void updateMember(MemberDto dto) {
		memberDao.updateMember(dto);
	}
	
	@Override
	public boolean checkPw(String userId, String userPw) {
		return memberDao.checkPw(userId, userPw);
	}
}
