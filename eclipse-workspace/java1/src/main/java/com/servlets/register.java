package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class register extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1> welcome to register servlet</h1>");
		String name=req.getParameter("user_name");
		String pass=req.getParameter("user_password");
		String email=req.getParameter("user_email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		String cond=req.getParameter("condition");
		System.out.println(cond);
		if(cond==null)
		{
			out.println("<h2>Agree terms and conditions</h2>");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req,resp);
		}
		else if(cond.equals("checked"))
		{
			out.println("<h2>Name :"+name+"</h2>");
			out.println("<h2>password :"+pass+"</h2>");
			out.println("<h2>email :"+email+"</h2>");
			out.println("<h2>gender :"+gender+"</h2>");
			out.println("<h2>course :"+course+"</h2>");
			RequestDispatcher rd=req.getRequestDispatcher("success");
			rd.forward(req, resp);
		}
	}
}
