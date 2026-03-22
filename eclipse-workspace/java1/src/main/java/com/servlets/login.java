package com.servlets;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login",name="login servlet")
public class login extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("login");
		PrintWriter writer=resp.getWriter();
		writer.println("<h1>from servlet</h1>");
		String s="ranjith";
		writer.println(s);
		char a='a';
		while(a>='a' && a<='z')
		{
			writer.print(a);
			a=(char)(a+1);
		}
		a='A';
		while(a>='A' && a<='Z')
		{
			writer.print(a);
			a=(char)(a+1);
		}
	}

}
