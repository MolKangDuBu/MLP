package com.woori.hello.board.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.woori.hello.board.domain.BoardDto;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao{

	List<BoardDto> list = new ArrayList<BoardDto>();
	
	public BoardDaoImpl()
	{
		int i=0;
		for(i=0; i<=10; i++)
			list.add(new BoardDto(i, "����"+i, "�ۼ���"+i, "����"+i, "2022-02-14"));
	}
	
	@Override
	public List<BoardDto> getList() {
		
		return list;
	}

	@Override
	public BoardDto getView(int id) {
		return list.get(id);
	}

	@Override
	public void insert(BoardDto dto) {

		int id = list.size();
		dto.setId(id);
		list.add(dto);
	}

}






