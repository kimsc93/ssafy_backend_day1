package com.ssafy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//파라미터로 num1과 num2를 받아서 합을 리턴하도록 처리하시오.
		String strnum1 = request.getParameter("num1");
		String strnum2 = request.getParameter("num2");
		int num1 = Integer.parseInt(strnum1);
		int num2 = Integer.parseInt(strnum2);
		//form의 submit을 처리하는 경우 = 화면출력
//		response.getWriter().append("<h1>" + num1+" + "+num2+ " = "+(num1+num2) +"</h1>");
		//ajax를 이용해서 처리하는 경우 = 데이터만 출력
		response.getWriter().append(""+(num1+num2));
	}
}
