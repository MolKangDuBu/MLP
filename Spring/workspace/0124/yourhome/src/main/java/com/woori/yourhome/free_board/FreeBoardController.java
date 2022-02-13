package com.woori.yourhome.free_board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class FreeBoardController {
	
	@Resource(name ="FreeBoardService")
	FreeBoardService service;
	
	@RequestMapping("/freeboard/list")
	String freeboard_list(FreeBoardDto dto, Model model) {
		dto.setStart(dto.getPg()*dto.getPageSize());
		model.addAttribute("boardList", service.getList(dto));
		model.addAttribute("totalCnt", 30);
		return "/freeboard/freeboard_list";
	}
	
	
	@RequestMapping("/freeboard/datalist")
	@ResponseBody
	List<FreeBoardDto> freeboard_datalist(FreeBoardDto dto) {
	
		return service.getList(dto);
	}
	
	
	@RequestMapping(value = "/freeboard/save")
	@ResponseBody
	String freeboard_save(FreeBoardDto dto, Model model) {
		if(dto.getGroup_id()==0) {
			service.insert(dto);
		}else {
			service.insert_reply(dto);
		}
		return "success";
	}
	
	
	@RequestMapping("/freeboard/write")
	String freeboard_write(Model model) {
		FreeBoardDto dto =new FreeBoardDto();
		model.addAttribute("boardDto", dto);
		return "/freeboard/freeboard_write";
	}

	@RequestMapping(value = "/freeboard/view")
	String freeboard_view(FreeBoardDto dto, Model model ) {
		
		FreeBoardDto resultdto = service.getView(dto);
		model.addAttribute("boardDto", resultdto);
		return "freeboard/freeboard_view";
	}
	
	
	@RequestMapping(value = "/freeboard/reply")
	String freeboard_reply(FreeBoardDto dto, Model model ) {
		
		FreeBoardDto resultdto = service.getView(dto);
		
		dto.setSeq("");
		dto.setContents("");
		
		model.addAttribute("boardDto", resultdto);
		model.addAttribute("mode", "reply");
		return "freeboard/freeboard_write";
	}
}
