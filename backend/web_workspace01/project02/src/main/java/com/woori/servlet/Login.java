package com.woori.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String ID= request.getParameter("userid");
		String Password= request.getParameter("password");
		String result="로그인 실패";
		
		
		if(ID.equals("admin")&&Password.equals("1234")) {
			result="로그인 성공";
			
		}
		String alarm = String.format("%s",result);
		
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<meta charset='utf-8'>");
		out.println("<body>");
		out.println("<h1>"+alarm+"</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush(); // 버퍼링
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
