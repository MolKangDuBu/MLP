package com.woori.myhome.score;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woori.myhome.board.BoardDto;
@Repository("ScoreDao")
public class ScoreDaoImpl implements ScoreDao{

	
	@Autowired
	SqlSessionTemplate sm; //sm객체를 통해서 디비 데이터를 읽고 쓰기

	
	/*
	 * sm - selectList("쿼리아이디", dto); List<ScoreDto> 형태를
	 * 		parameterType = "ScoreDto",  resultType = "ScoreDto" 
	 * insert
	 * selectOne
	 * */
	@Override
	public List<ScoreDto> getlist() {
		// TODO Auto-generated method stub
		//xml파일의 쿼리 id값
		return sm.selectList("Score_getlist", null);//Score.xml에서 Score_getlist를 찾음
	}

	@Override
	public void insert(ScoreDto dto) {
		// TODO Auto-generated method stub
		sm.insert("Score_insert", dto);
	}

	@Override
	public ScoreDto getView(String id) {
		// TODO Auto-generated method stub
		return sm.selectOne("Score_getView", id);
	}
	
}
