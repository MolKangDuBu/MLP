package com.woori.backendproject.Login;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value = "/login_page")
	String login_page() {
		return "login";
	}
	
	
	@RequestMapping(value = "/login")
	@ResponseBody
	HashMap<String, String> login(LoginDto dto){
			
		System.out.println("ID : "+ dto.getId());
		System.out.println("Password : "+dto.getPassword());
		
		HashMap<String, String> map = new HashMap<String, String>();
		if(dto.getId().equals("abcd")&&dto.getPassword().equals("1234")){
			map.put("result", "success");
		}else {
			map.put("result", "fail");
		}
		
		return map;
		
	}
}
