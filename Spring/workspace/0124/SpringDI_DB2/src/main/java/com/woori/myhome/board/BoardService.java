package com.woori.myhome.board;

import java.util.List;

public interface BoardService {
	List<BoardDto>getList(BoardDto dto);
	int getTotal(BoardDto dto);
	void insert(BoardDto dto);
	BoardDto getView(String id);
	void delete(String id);
	void update(BoardDto dto);
}
