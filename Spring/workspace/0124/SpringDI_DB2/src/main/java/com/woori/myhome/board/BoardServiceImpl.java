package com.woori.myhome.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	//@Autowired
	@Resource(name = "boardDao")
	BoardDao boardDao;
	
	@Override
	public List<BoardDto> getList(BoardDto dto) {
		// TODO Auto-generated method stub
		return boardDao.getlist(dto);
	}

	@Override
	public void insert(BoardDto dto) {
		// TODO Auto-generated method stub
		boardDao.insert(dto);
	}

	@Override
	public BoardDto getView(String id) {
		// TODO Auto-generated method stub
				
		return boardDao.getView(id);
	}

	@Override
	public int getTotal(BoardDto dto) {
		// TODO Auto-generated method stub
		return boardDao.getTotal(dto);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		boardDao.delete(id);
	}

	@Override
	public void update(BoardDto dto) {
		// TODO Auto-generated method stub
		boardDao.update(dto);
	}

}
