package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ser2
 */
public class ser2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie c[]=req.getCookies();
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		if(c==null)
		{
			out.println("<h2> u are new user <a href='index1.html'>home page</a> </h2>");
			return;
		}
		boolean b=false;
		for(int i=0;i<c.length;i++)
		{
			String s=c[i].getName();
			if(s.equals("user"))
			{
				out.println("<h2> welcome back "+c[i].getValue()+" "+i+"<h2>");
				b=true;
				break;
			}
		}
		if(b==false)
		{
			out.println("<h2> u are new user <a href='index1.html'>home page</a> </h2>");
		}
	}
}
