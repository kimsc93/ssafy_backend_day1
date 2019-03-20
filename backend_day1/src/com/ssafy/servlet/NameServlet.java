package com.ssafy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NameServlet
 */
@WebServlet("/name")
public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답에 대한 인코딩 처리 필요
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");
		System.out.println(name);
		response.getWriter().append("doGet : " + name + "님 반갑습니다.");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청 파라미터에 대한 인코딩 처리
		request.setCharacterEncoding("utf-8");
		//응답에 대한 인코딩 처리 필요
		response.setContentType("text/html;charset=utf-8");
		
		String name = request.getParameter("name");
		//request에 추가적인 속성 저장
		request.setAttribute("key", new Object());
		Object obj = request.getAttribute("key");
		System.out.println(name);
		response.getWriter().append("doPost : " + name + "님 반갑습니다.");
	}
	
//	request를 통해서 자료를 전송하는 방식
//	파라미터를 이용하는 방식
//	key = value의 쌍으로 구성된 자료,value의 타입은 언제나 String
//	최초 request가 생성될 때 구성되며 이후 추가될 수는 없다!
//	String request.getParameter(String key)
//	attribute를 이용하는 방식
//	key = value의 쌍으로 구성된 자료 , value의 타입은 Object
//	프로그램을 통해서 자유롭게 추가/삭제/조회/수정 가능
//	Object request.getAttribute(String key)
//	void request.setAttribute(String key,Object value)
	
}
