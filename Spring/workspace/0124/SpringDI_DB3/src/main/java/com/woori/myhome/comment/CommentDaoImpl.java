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

	@Override
	public CommentDto comment_getView(CommentDto dto) {
		// TODO Auto-generated method stub
		return sm.selectOne("Comment_getView", dto);
	}

	@Override
	public void comment_delete(CommentDto dto) {
		// TODO Auto-generated method stub
		sm.delete("Comment_delete", dto);
	}

	@Override
	public void comment_update(CommentDto dto) {
		// TODO Auto-generated method stub
		sm.update("Comment_update", dto);
	}




}
