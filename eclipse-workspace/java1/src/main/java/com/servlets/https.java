package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class https extends HttpServlet
{
	public void doGet(HttpServletRequest res,HttpServletResponse resp) throws ServletException,IOException
	{
		System.out.println("this is a http servlet");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>This is a get method of http servlet</h1>");	
	}
}
