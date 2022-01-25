package com.woori.myhome.score;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.woori.myhome.board.BoardDto;
@Controller
public class ScoreController {

	@Resource(name = "scoreService")
	ScoreService service;
	
	@RequestMapping(value = "/score/list",method= RequestMethod.GET)
	String score_list(Model model) {
		List<ScoreDto>list = service.getlist();
		for(ScoreDto tempDto :list) {
			System.out.println(tempDto.getName());
		}
		model.addAttribute("scoreList", list);
		return "score/score_list";
	}
	
	@RequestMapping(value = "/score/view", method = RequestMethod.GET)
	String score_view(String id, Model model) {
		
		ScoreDto dto = service.getView(id);
		model.addAttribute("scoreDto", dto);
		return "score/score_view";
	}
	
	
	
	
	@RequestMapping(value = "/score/write")
	String board_write() {
		return "score/score_write";
	}
	
	@RequestMapping(value="/score/save")
	String board_save(ScoreDto dto) {
		service.insert(dto);
		return "redirect:/score/list";
	}
	
	
}
