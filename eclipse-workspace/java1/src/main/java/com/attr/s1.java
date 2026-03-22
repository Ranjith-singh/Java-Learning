package com.attr;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class s1
 */
public class s1 extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String n1=req.getParameter("n1");
		String n2=req.getParameter("n2");
		int s=Integer.parseInt(n1)+Integer.parseInt(n2);
		req.setAttribute("sum",s);
		RequestDispatcher rd = req.getRequestDispatcher("s2");
		rd.forward(req, resp);
	}

}
