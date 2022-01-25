package com.woori.myhome.score;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service("scoreService")
public class ScoreServiceImpl implements ScoreService{

	@Resource(name = "ScoreDao")
	ScoreDao dao;
	
	@Override
	public List<ScoreDto> getlist() {
		// TODO Auto-generated method stub
		return dao.getlist();
	}

	@Override
	public void insert(ScoreDto dto) {
		// TODO Auto-generated method stub
		dao.insert(dto);
	}

	@Override
	public ScoreDto getView(String id) {
		// TODO Auto-generated method stub
		return dao.getView(id);
	}

}
