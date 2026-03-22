package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s2
 */
public class s2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n1=Integer.parseInt(req.getParameter("n1"));
		int n2=Integer.parseInt(req.getParameter("n2"));
		int p=n1*n2;
		
		//get attribute from request object
		
		int sum=(int)req.getAttribute("sum");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2> the sum= "+sum+"<h2>");
		out.println("<h2> the product= "+p+"<h2>");
	}

}
