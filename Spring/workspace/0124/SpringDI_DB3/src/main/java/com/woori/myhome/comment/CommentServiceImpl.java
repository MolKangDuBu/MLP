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

}
