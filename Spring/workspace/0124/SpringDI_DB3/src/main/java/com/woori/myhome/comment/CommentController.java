package com.woori.myhome.comment;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class CommentController {
	@Resource(name = "commentService")
	CommentService service;
	
	
	@RequestMapping(value = "/comment/insert")
	@ResponseBody
	public HashMap<String, String>member_insert(CommentDto dto){
		service.insert(dto);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
	
	@RequestMapping(value = "/comment/list")
	@ResponseBody
	public List<CommentDto>member_list(CommentDto dto){
		List<CommentDto> list = service.getList(dto);
		return list;
	}
}
