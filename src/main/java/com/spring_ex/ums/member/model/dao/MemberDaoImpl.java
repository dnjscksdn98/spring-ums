package com.spring_ex.ums.member.model.dao;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

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
		sqlSession.delete("member.deleteMember", userId);
	}
	
	@Override
	public void updateMember(MemberDto dto) {
		sqlSession.update("member.updateMember", dto);
	}
	
	@Override
	public boolean checkPw(String userId, String userPw) {
		boolean result = false;
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("userId", userId);
		map.put("userPw", userPw);
		
		int cnt = sqlSession.selectOne("member.checkPw", map);
		if(cnt == 1) result = true;
		
		return result;
	}
}
