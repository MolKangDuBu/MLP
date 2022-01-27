package com.woori.myhome.board;

import java.util.List;

public interface BoardDao {
	List<BoardDto> getlist(BoardDto dto);
	int getTotal(BoardDto dto);
	void insert(BoardDto dto);
	BoardDto getView(String id);
}
