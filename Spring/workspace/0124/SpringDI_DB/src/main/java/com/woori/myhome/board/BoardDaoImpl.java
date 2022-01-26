package com.woori.myhome.board;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("boardDao") //꼭 써줘야함 스프링 프레임워크가 구분함
public class BoardDaoImpl implements BoardDao{
	
	@Autowired
	SqlSessionTemplate sm; //sm객체를 통해서 디비 데이터를 읽고 쓰기

	@Override
	public List<BoardDto> getlist() {
		// TODO Auto-generated method stub
		
		return sm.selectList("Board_getList", null);
	}

	@Override
	public void insert(BoardDto dto) {
		// TODO Auto-generated method stub
		sm.insert("Board_insert", dto);
	}

	@Override
	public BoardDto getView(String id) {
		// TODO Auto-generated method stub
		return sm.selectOne("Board_getView", id);
	}
	
}
