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
		System.out.println("comment_id : "+dto.getComment_id());
		if(dto.getComment_id().equals("")) {
			service.insert(dto);
		}else {
			service.comment_update(dto);
		}
			
		
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
	
	@RequestMapping(value = "/comment/getView")
	@ResponseBody
	public CommentDto comment_getView(CommentDto dto){
		System.out.println("id : "+dto.getId());
		CommentDto resultDto = service.comment_getView(dto);
		return resultDto;
	}
	

	
	@RequestMapping(value = "/comment/delete")
	@ResponseBody
	public HashMap<String, String> comment_delete(CommentDto dto){
		service.comment_delete(dto);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
	

}
