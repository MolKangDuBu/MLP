package com.woori.myhome.comment;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("commentDao")
public class CommentDaoImpl implements CommentDao{

	
	@Autowired
	SqlSessionTemplate sm;
	
	@Override
	public void insert(CommentDto dto) {
		// TODO Auto-generated method stub
		sm.insert("Comment_insert", dto);
	}

	@Override
	public List<CommentDto> getList(CommentDto dto) {
		// TODO Auto-generated method stub
		return sm.selectList("Comment_list", dto);
	}

}
