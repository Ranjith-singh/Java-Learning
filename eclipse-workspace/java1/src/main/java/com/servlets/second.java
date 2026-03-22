package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;

public class second extends GenericServlet
{
	@Override
	public void service(ServletRequest req,ServletResponse resp) throws IOException,ServletException
	{
		System.out.println("servlet using the generric servlet");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1> this is my second servlet using generic servlet</h1>");
	}
}
