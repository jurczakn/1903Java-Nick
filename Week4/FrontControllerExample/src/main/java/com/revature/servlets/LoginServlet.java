package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pojos.User;
import com.revature.services.UserService;

public class LoginServlet extends HttpServlet {

	UserService userService = new UserService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getSession(false) != null) {

			resp.sendRedirect("emphome");

		} else {
			resp.sendRedirect("/FrontControllerExample/login.html");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = userService.loginUser(username, password);
		if (user == null) {
			resp.setStatus(401);
			resp.getWriter().write("failed login");
		} else {
			HttpSession sess = req.getSession(true);
			sess.setAttribute("user", user);
			req.getRequestDispatcher("emphome").forward(req, resp);
		}
	}

}
