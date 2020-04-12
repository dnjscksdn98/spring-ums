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
		
	}
	
	@Override
	public MemberDto viewMember() {
		return null;
	}
	
	@Override
	public void deleteMember(String userId) {
		
	}
	
	@Override
	public void updateMember(MemberDto dto) {
		
	}
}
