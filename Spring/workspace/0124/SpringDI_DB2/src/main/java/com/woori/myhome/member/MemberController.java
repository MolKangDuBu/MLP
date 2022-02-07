package com.woori.myhome.member;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	
	@Resource(name = "memberService")
	MemberService memberService;
	
	@RequestMapping("/member/join")
	String member_register() {
		return "member/member_register";
	}
	
	
	@RequestMapping("/member/isDuplicate")
	@ResponseBody //Ajax 요청시 데이터가 출력됨, jsp 이동을 막는 역할
				  //자바객체를 json 형태로 전환시킴
	public HashMap<String, String> member_isDuplicte(MemberDto dto)
	{
		HashMap<String, String> map = new HashMap<String, String>();	
		map.put("result", memberService.isDuplicate(dto)+"");
		
		return map;
	}

	
	@RequestMapping(value = "/member/insert",method = RequestMethod.POST)
	@ResponseBody
	public HashMap<String, String>member_insert(MemberDto dto){
		memberService.insert(dto);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
	
	
	@RequestMapping("/member/login")
	public String member_login() {
		
		return "member/member_login";
	}
	
	@RequestMapping(value = "/member/login_proc")
	@ResponseBody
	public HashMap<String, String>member_proc(MemberDto dto, HttpServletRequest request){
		//각 페이지별로 정보 공유가 안된다.
		//예외(쿠기 또는 세션을 사용)
		//쿠기 - 본인컴퓨터에 session - 서버에(보안을 강화시키고자 할때)
		HttpSession session = request.getSession();
		MemberDto resultDto = memberService.getInfo(dto);
		HashMap<String, String> map = new HashMap<String, String>();
		System.out.println(resultDto);
		if(resultDto ==null) {
			map.put("flag","2");
		}else {
			if(resultDto.getPassword().equals(dto.getPassword())) {//로그온  성공시 세션에 정보를 저장함
				map.put("flag", "1");
				session.setAttribute("userid", resultDto.getUserid());
				session.setAttribute("username", resultDto.getUsername());
				session.setAttribute("email", resultDto.getEmail());
				session.setAttribute("phone", resultDto.getPhone());
			}else {
				map.put("flag", "3");
			}
			
		}
			
		
		return map;
	}
	
	@RequestMapping("/member/logout")
	public String member_logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();//세션 데이터 삭제 
		return "redirect:/";
	}
}
