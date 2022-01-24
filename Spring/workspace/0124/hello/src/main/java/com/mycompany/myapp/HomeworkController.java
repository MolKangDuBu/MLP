package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeworkController {
	

	
	@RequestMapping(value = "/homework/myname", method= RequestMethod.GET)
	public String myname(String usename, Model model) {
		String name = usename;
		System.out.println(name);
		model.addAttribute("result", name);
		
		return "homework/myname";
	}
	
	
	@RequestMapping(value = "/homework/gugudan", method = RequestMethod.GET)
		public String gugudan(int dan, Model model) {
			StringBuffer sb = new StringBuffer();
			for(int i =1; i<10;i++) {
				sb.append(i +" x "+dan+" = "+(i*dan)+"<br/>");
			} 
			model.addAttribute("result", sb);
			return "homework/gugudan";
		}

	@RequestMapping (value = "/homework/score", method = RequestMethod.GET)
	public String score() {
		return "/homework/score";
		
	}
	
	

	@RequestMapping (value = "/homework/score_proc", method = RequestMethod.GET)
	public String score_proc(String name, String  kor, String eng, String mat, Model model) {
		String Name = name;
		int Kor = Integer.parseInt(kor);
		int Mat = Integer.parseInt(mat);
		int Eng = Integer.parseInt(eng);
		int total = Kor+Mat+Eng;
		int avg = total/3;
		
		String result = String.format("%s의 총점은 %d이고 평균은 %d이다.", Name, total, avg);
		model.addAttribute("result", result);
		
		return "/homework/score_proc";
		
	}
}

