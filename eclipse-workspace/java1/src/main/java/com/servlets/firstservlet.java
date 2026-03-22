package com.servlets;

import java.io.*;
import java.util.Date;

import org.apache.catalina.connector.Response;

import jakarta.servlet.*;

public class firstservlet implements Servlet
{
	//life cycle method
	ServletConfig conf;
	public void init(ServletConfig config)
	{
		conf=config;
		System.out.println("creating object......");
	}
	public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
	{
		System.out.println("Servicing......");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>This is output from servicing method</h1>");
		out.println("Today's date is"+new Date().toString());
	}
	public void destroy()
	{
		System.out.println("going to destroy object");
	}
	
	//non life cycle method
	public ServletConfig getServletConfig()
	{
		return conf;
	}
	public String getServletInfo()
	{
		return "Servlet created by ranjith";
	}
}
