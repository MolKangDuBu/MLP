package com.woori.myhome.score;

import java.util.List;



public interface ScoreDao {
	List<ScoreDto>  getlist();
	void insert(ScoreDto dto);
	ScoreDto getView(String id);
}
