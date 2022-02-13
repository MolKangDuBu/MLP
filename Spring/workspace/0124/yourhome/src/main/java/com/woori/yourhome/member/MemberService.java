package com.woori.yourhome.member;

public interface MemberService {
	boolean isDuplicate(MemberDto dto);
	void insert(MemberDto dto);
	MemberDto getInfo(MemberDto dto);
	MemberDto findId(MemberDto dto);
	MemberDto findPassword(MemberDto dto);
	void member_update(MemberDto dto);
}
