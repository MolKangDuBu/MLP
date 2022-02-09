package com.woori.myhome.comment;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("commentService")
public class CommentServiceImpl implements CommentService{

	
	@Resource(name = "commentDao")
	CommentDao commentdao;
	@Override
	public void insert(CommentDto dto) {
		// TODO Auto-generated method stub
		commentdao.insert(dto);
	}
	@Override
	public List<CommentDto> getList(CommentDto dto) {
		// TODO Auto-generated method stub
		return commentdao.getList(dto);
	}
	@Override
	public void comment_delete(CommentDto dto) {
		// TODO Auto-generated method stub
		commentdao.comment_delete(dto);
	}
	@Override
	public void comment_update(CommentDto dto) {
		// TODO Auto-generated method stub
		commentdao.comment_update(dto);
	}
	@Override
	public CommentDto comment_getView(CommentDto dto) {
		// TODO Auto-generated method stub
		return commentdao.comment_getView(dto);
	}

}
