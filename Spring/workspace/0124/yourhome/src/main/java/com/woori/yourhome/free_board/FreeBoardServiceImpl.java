package com.woori.yourhome.free_board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("FreeBoardService")
public class FreeBoardServiceImpl implements FreeBoardService{

	@Resource(name ="freeboardDao")
	FreeBoardDao dao;
	
	@Override
	public List<FreeBoardDto> getList(FreeBoardDto dto) {
		// TODO Auto-generated method stub
		return dao.getList(dto);
	}

	@Override
	public void insert(FreeBoardDto dto) {
		// TODO Auto-generated method stub
		dao.insert(dto);
	}

	@Override
	public void insert_reply(FreeBoardDto dto) {
		// TODO Auto-generated method stub
		dao.insert_reply(dto);
	}

	@Override
	public FreeBoardDto getView(FreeBoardDto dto) {
		// TODO Auto-generated method stub
		return dao.getView(dto);
	}

	
}
