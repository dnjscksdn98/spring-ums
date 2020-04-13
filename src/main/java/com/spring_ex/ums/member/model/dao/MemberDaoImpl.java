package com.spring_ex.ums.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring_ex.ums.member.model.dto.MemberDto;


@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<MemberDto> memberList(){
		return sqlSession.selectList("member.memberList");
	}
	
	@Override
	public void insertMember(MemberDto dto) {
		sqlSession.insert("member.insertMember", dto);
	}
	
	@Override
	public MemberDto viewMember(String userId) {
		return sqlSession.selectOne("member.viewMember", userId);
	}
	
	@Override
	public void deleteMember(String userId) {
		
	}
	
	@Override
	public void updateMember(MemberDto dto) {
		
	}
}
