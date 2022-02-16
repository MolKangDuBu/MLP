package com.woori.hello;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

	@RequestMapping("/")
	String member_login() {
		return "/member/login";
	}
	
	
	@RequestMapping("/member/login")
	@ResponseBody
	HashMap<String, String> member_login(String userid, String password) {
		HashMap<String, String>resultMap = new HashMap<String, String>();
		if(userid.equals("abcd") &&password.equals("1234")) {
			resultMap.put("msg", "login ok");
		}else {
			resultMap.put("msg", "login fail");
		}
		return resultMap;
	}
}
