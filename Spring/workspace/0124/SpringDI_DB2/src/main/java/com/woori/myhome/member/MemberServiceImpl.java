package com.woori.myhome.member;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Resource(name="memberDao")
	MemberDao memberDao;
	@Override
	public boolean isDuplicate(MemberDto dto) {
		// TODO Auto-generated method stub
		return memberDao.isDuplicate(dto);
	}
	@Override
	public void insert(MemberDto dto) {
		// TODO Auto-generated method stub
		memberDao.insert(dto);
	}
	@Override
	public MemberDto getInfo(MemberDto dto) {
		// TODO Auto-generated method stub
		return memberDao.getInfo(dto);
	}

}
