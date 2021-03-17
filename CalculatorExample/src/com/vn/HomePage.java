package com.vn;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomePage
 */
@WebServlet("/calculator")
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = request.getParameter("so1");
		String s2 = request.getParameter("so2");
		Double s11 = Double.parseDouble(s1);
		Double s22 = Double.parseDouble(s2);
		String operation = request.getParameter("operation");
		
		Double result = null;
		switch (operation) {
		case "/":
			result = s11/s22;
			break;
		case "*":
			result = s11*s22;
			break;
		case "-":
			result = s11-s22;
			break;
		default:
			result = s11+s22;
			break;
		}
		request.setAttribute("KETQUA", result);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	
}
