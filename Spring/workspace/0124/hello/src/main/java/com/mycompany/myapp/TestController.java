package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//어노테이션 - @Controller가 있어야 스프링이 읽어 객체를 읽을 수 있음
//DispatchServlet이 컨트롤러를 연결해줌
@Controller
public class TestController {
	@RequestMapping("/test")// url하고 컨트롤러의 함수하고 연결한다.
	// 전체 사이트에 한개만 있어야함
	String test() {
		
		return "test";//src/main/webapp/WEB-INF/views/test.jsp로 포워딩
	}
	
	///////////////////////////
	//jsp로 이동
	//Model model - request객체임
	@RequestMapping(value = "/calcu", method= RequestMethod.GET)
	String calcu() {
		return "calculator";
	}
	//jsp로부터 받아온 파라미터값을 처리함
	@RequestMapping(value ="/calcu_proc", method=RequestMethod.GET)
	String calcu_proc(int x, int y, Model model) {
		int result=x+y;
		model.addAttribute("result", result);//jsp에 데이터 전달
		return "calc_proc";
		
	}
	///////////////////////////////
}
