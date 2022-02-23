package com.woori.hello.board.repository;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woori.hello.board.domain.BoardDto;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao{

	List<BoardDto> list = new ArrayList<BoardDto>();
	
	@Autowired
	SqlSessionTemplate sm;
	
	@Override
	public List<BoardDto> getList() {
		
		return sm.selectList("Board_getList", null);
	}

	@Override
	public BoardDto getView(int id) {
		return sm.selectOne("Board_getView", id);
	}

	@Override
	public void insert(BoardDto dto) {

		sm.insert("Board_insert",dto);
	}

}






