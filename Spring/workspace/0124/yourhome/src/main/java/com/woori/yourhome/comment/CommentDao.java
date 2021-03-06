package com.woori.yourhome.comment;

import java.util.List;

public interface CommentDao {
	List<CommentDto>getList (CommentDto dto);
	void insert(CommentDto dto);
	CommentDto comment_getView(CommentDto dto);
	void comment_delete(CommentDto dto);
	void comment_update(CommentDto dto);
}
