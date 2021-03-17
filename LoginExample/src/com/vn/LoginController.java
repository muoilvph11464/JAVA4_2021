package com.vn;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.model.User;

/**
 * Servlet implementation class HomePage
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	
	//login
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. get username and password from UI
		String uname = request.getParameter("username");
		String upass = request.getParameter("passwowrd");
		
		//2. Validate 
		boolean validate = true;
		if(uname==null || "".equals(uname)) {
			request.setAttribute("message", "Phai nhap username");
			validate= false;
		}
		if(upass==null || "".equals(upass)) {
			request.setAttribute("message", "Phai nhap password");
			validate= false;
		}
		if(!validate) {
			//4. Return status
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		//3. Check in DB
		if("poly".equals(upass)&& "poly".equals(uname)) {
			User user = new User(uname, upass);
			request.getSession().setAttribute("ULOGGED", user);
			//request.getRequestDispatcher("index.jsp").forward(request, response);
			//4. Return status
			response.sendRedirect(request.getContextPath());
		} else {
			request.setAttribute("message", "Nhap sai password or username");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

	
}
