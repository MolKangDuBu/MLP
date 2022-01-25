package com.woori.myhome.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("boardDao") //꼭 써줘야함 스프링 프레임워크가 구분함
public class BoardDaoImpl implements BoardDao{
	
	List<BoardDto> list = new ArrayList<BoardDto>();
	
	public BoardDaoImpl() {
		for(int i =1; i<=10;i++)
		list.add(new BoardDto(i+"", "제목"+i, "작성자"+i, "내용"+i, "2022-11-23"));
	}
	
	
	@Override
	public List<BoardDto> getlist() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void insert(BoardDto dto) {
		// TODO Auto-generated method stub
		dto.setId(String.valueOf(list.size()+1));
		list.add(dto);
	}


	@Override
	public BoardDto getView(String id) {
		// TODO Auto-generated method stub
		int nid = Integer.parseInt(id)-1;		
		return list.get(nid);
	}

}
