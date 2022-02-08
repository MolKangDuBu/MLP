package com.woori.myhome.comment;

import java.util.List;

public interface CommentService {
	List<CommentDto>getList (CommentDto dto);
	void insert(CommentDto dto);
}
