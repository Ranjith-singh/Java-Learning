package com.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class register1
 */
@MultipartConfig
public class register1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
		
			//getting all the incoming details 
			String name=req.getParameter("user_name");
			String password=req.getParameter("password");
			String email=req.getParameter("email");
			System.out.println(name+" "+password+" "+email);
			Part part=req.getPart("image");
			String filename =part.getSubmittedFileName();
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			//out.println(filename);
			try
			{
			Thread.sleep(3000);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","1995");
			String q="Insert into user(name,password,email,imagename) values (?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setString(1,name);
			pst.setString(2,password);
			pst.setString(3,email);
			pst.setString(4,filename);
			pst.executeUpdate();
			
			//upload file
			InputStream is=part.getInputStream();
			byte []data=new byte[is.available()];
			is.read(data);
			String path=req.getServletContext().getRealPath("")+"img"+File.separator;
			//out.println(path);
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(data);
			fos.close();
			out.println("done");
			con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				out.println("error.......");
			}
		}

}
