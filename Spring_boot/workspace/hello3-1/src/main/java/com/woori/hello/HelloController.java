package com.woori.hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController - > @ResponseBody 대신 jsp 엔진이 없고
//데이터를 jsp가 아니라 json형태로 반환함
@RestController
public class HelloController {
	@RequestMapping("/")
	String hello() {
		return "Hello Spring boot 2";
	}
	
	@RequestMapping("/personInfo")
	HashMap<String, String> personInfo(){
		HashMap<String, String> person = new HashMap<String, String>();
		person.put("name", "ㅎㅇ1");
		person.put("age", "27");
		person.put("job", "가수");
		person.put("phone", "010-0000-0000");
		person.put("email", "csy@kakao.com");
		
		return person;
	}
	
	@RequestMapping("/personList")
	List<HashMap<String, String>> personList(){
		List<HashMap<String,String>> list = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> person;
		
		person = new HashMap<String, String>();
		person.put("name", "홍길동");
		person.put("phone", "010-00000-0001");
		person.put("email", "hong@hanmail.net");
		list.add(person);
		
		person = new HashMap<String, String>();
		person.put("name", "asd");
		person.put("phone", "010-0000-0000");
		person.put("email", "choi@hanmail.net");
		list.add(person);
		
		person = new HashMap<String, String>();
		person.put("name", "aaaa");
		person.put("phone", "010-1000-0000");
		person.put("email", "aaadoi@hanmail.net");
		list.add(person);
		
		return list;
		
		
	}
	
	//http://127.0.0.1:9000/login?userid=test&password=1234
	//파라미터 값 받기
	@RequestMapping("/login")
	String login(String userid, String password) {
		if(userid.equals("test")&&password.equals("1234")) {
			return "true";
		}else 
			return "false";
	}
	
	//http://127.0.0.1:9000/findpassword/test
	//새로운 파라미터 방식
	@RequestMapping("/findpassword/{userid}")
	String login(@PathVariable("userid") String userid) {
		System.out.println(userid);
		if(userid.equals("test")) {
			return "1234";
		}else 
			return "";
	}
	
	//http://127.0.0.1:9000/add?x=5&y=7
	@RequestMapping("/add")
	String login(int x, int y) {
		return String.format("%d X %d = %d",x, y, x+y);
	}
	
	//http://127.0.0.1:9000/add/5/7
	@RequestMapping("/add/{x}/{y}")
	String sub(@PathVariable("x")int x, @PathVariable("y")int y) {
		return String.format("%d X %d = %d",x, y, x+y);
	}
	
}
