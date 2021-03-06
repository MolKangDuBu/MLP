package com.woori.hello.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woori.hello.board.domain.BoardDto;
import com.woori.hello.board.service.BoardService;

@CrossOrigin("*") //http:127.0.0.1 혹은 localhost
@RestController
public class BoardController {
	
	@Resource(name="boardService")
	BoardService boardService;
	
	
	@RequestMapping("/board/list")
	List<BoardDto> getList()
	{
		return boardService.getList();
	}
	
	
	@RequestMapping("/board/view/{id}")
	BoardDto getView(@PathVariable("id")int id)
	{		
		return	boardService.getView(id);
	}
	
	// Map -> HashMap의 추상클래스 
	//axios가 json으로 보내는데 json을 받기 위해서는 @RequestBody가 있어야함
	@RequestMapping("/board/insert")
	Map<String, String> getView(@RequestBody BoardDto dto)
	{	
		System.out.println(dto.getTitle());
		boardService.insert(dto);
		Map<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
}






