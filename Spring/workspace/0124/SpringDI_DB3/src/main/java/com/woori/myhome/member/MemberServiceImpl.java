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
	@Override
	public MemberDto findId(MemberDto dto) {
		// TODO Auto-generated method stub
		return memberDao.findId(dto);
	}
	@Override
	public MemberDto findPassword(MemberDto dto) {
		// TODO Auto-generated method stub
		return memberDao.findPassword(dto);
	}
	@Override
	public void member_update(MemberDto dto) {
		// TODO Auto-generated method stub
		memberDao.member_update(dto);
	}

}
