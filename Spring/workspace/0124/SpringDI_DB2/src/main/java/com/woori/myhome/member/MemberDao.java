package com.woori.myhome.member;

public interface MemberDao {
	boolean isDuplicate(MemberDto dto);
	void insert(MemberDto dto);
	MemberDto getInfo(MemberDto dto);
	
}
