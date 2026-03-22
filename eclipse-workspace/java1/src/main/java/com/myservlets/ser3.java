package com.myservlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ser3
 */
public class ser3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			// name fetch
			String name=req.getParameter("user_name");
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			out.println("<h2>"+name+"</h2>");
			out.println("<form action='ser4'>"
					+ "<input type='hidden' name='user' value='"+name+"'/>"
					+ "<button type=submit style='font-size : 35px;'>go to ser4</button>"
					+ ""
					+ ""
					+ "</form>");
			
		}
}
