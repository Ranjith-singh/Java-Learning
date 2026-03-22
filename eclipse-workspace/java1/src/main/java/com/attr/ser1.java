package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.tomcat.util.http.ServerCookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ser1
 */
public class ser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
    	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		String name=req.getParameter("name");
    		resp.setContentType("text/html");
    		PrintWriter out=resp.getWriter();
    		Cookie c=new Cookie("user",name);
    		resp.addCookie(c);    		
    		out.println("<h2> welcome "+name+" to my website</h2>");
    		out.println("<h2><a href='ser2'>go to servlet2</a></h2>");
    	}

}
