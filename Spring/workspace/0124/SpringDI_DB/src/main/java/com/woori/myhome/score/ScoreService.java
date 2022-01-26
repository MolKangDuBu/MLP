package com.woori.myhome.score;

import java.util.List;

public interface ScoreService {
	List<ScoreDto>  getlist();
	void insert(ScoreDto dto);
	ScoreDto getView(String id);
}
