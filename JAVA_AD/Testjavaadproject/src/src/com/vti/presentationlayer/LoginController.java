package com.vti.presentationlayer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vti.businesslayer.IUserService;
import com.vti.businesslayer.UserService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private IUserService userService;

	/*
	 * @see javax.servlet.GenericServlet#init()
	 */
	@Override
	public void init() throws ServletException {
		super.init();

		try {
			userService = new UserService();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// forward to login.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get parameter
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// check database
		// login success
		try {
			if (userService.login(username, password)) {

				// redirect to home page
				// front-end: ${pageContext.request.contextPath}
				response.sendRedirect(request.getContextPath());

			} else {

				// redirect to login page
				response.sendRedirect(request.getContextPath() + "/login");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
