package com.ssafy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

/**
 * Servlet implementation class FlowControlServlet
 */
@WebServlet("/flow")
public class FlowControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter = request.getParameter("by");
		if(parameter == null) {
			response.getWriter().append("<h1>flow</h1>");
		}
		else if(parameter.equals("forward")) {
			//gugu로 대체 연결
			javax.servlet.RequestDispatcher disp = request.getRequestDispatcher("biz/gugu");
			disp.forward(request, response);
		}
		else if(parameter.equals("redir")) {
			response.sendRedirect("biz/gugu");
		}
	}
}
