package com.woori.myhome.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao{

	
	@Autowired
	SqlSessionTemplate sm;
	
	@Override
	public boolean isDuplicate(MemberDto dto) {
		
		int cnt = sm.selectOne("Member_isduplicate", dto);

		if(cnt==0)
			return false; //중복아님, 사용가능한 아이디임  
		else
			return true; //이미 사용중임 
	}

	@Override
	public void insert(MemberDto dto) {
		// TODO Auto-generated method stub
		sm.insert("Member_insert", dto);
	}

	@Override
	public MemberDto getInfo(MemberDto dto) {
		// TODO Auto-generated method stub
		
		return sm.selectOne("Member_getInfo", dto);
	}

	@Override
	public MemberDto findId(MemberDto dto) {
		// TODO Auto-generated method stub
		return sm.selectOne("Member_findid", dto);
	}

	@Override
	public MemberDto findPassword(MemberDto dto) {
		// TODO Auto-generated method stub
		return sm.selectOne("Member_findpassword", dto);
	}

	@Override
	public void member_update(MemberDto dto) {
		// TODO Auto-generated method stub
		sm.update("Member_update", dto);
	}
	
	
	
}
