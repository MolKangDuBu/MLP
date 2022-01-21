package com.woori.project03.servlet;

import java.io.IOException;

import com.woori.project03.Member.MemberController;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/Member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MemberServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		String cmd = req.getParameter("cmd");
		MemberController controller = new MemberController();
		
		if(cmd == null||cmd.equals("list")) {
			//request setAttribute 함수를 이용해 사용자가 request 객체에 자신의 객체를 저장할 수 있다.
			req.setAttribute("MemberList", controller.getList());
			//jsp 페이지로 전달
			RequestDispatcher rd = req.getRequestDispatcher("/member/Login.jsp");
			rd.forward(req, resp);
		}
		else if(cmd.equals("check")) {
			controller.Check(req, resp);
			req.setAttribute("memberDto", controller.getView(req, resp));
			RequestDispatcher rd = req.getRequestDispatcher("/member/main_page.jsp");
			rd.forward(req, resp);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
