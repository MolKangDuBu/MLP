package com.woori.myhome.score;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository("ScoreDao")
public class ScoreDaoImpl implements ScoreDao{

	
	List<ScoreDto>list = new ArrayList<ScoreDto>();
	
	public ScoreDaoImpl(){
		list.add(new ScoreDto("1", "홍길동", 100, 100, 100, 100));
	}
	
	
	
	@Override
	public List<ScoreDto> getlist() {
		// TODO Auto-generated method stub
		
		return list;
	}

	@Override
	public void insert(ScoreDto dto) {
		// TODO Auto-generated method stub
		dto.setId(String.valueOf(list.size()+1));
		list.add(dto);
	}

	@Override
	public ScoreDto getView(String id) {
		// TODO Auto-generated method stub
		int nid = Integer.parseInt(id)-1;		
		return list.get(nid);
		
	}

}
