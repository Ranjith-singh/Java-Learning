package jdbc;

import java.sql.*;
import java.io.*;

public class jdbc2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//prepared statement
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","1995");
			String q="Insert into table1(tname,tcity) values (?,?)";
			PreparedStatement pst=con.prepareStatement(q);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("entername:");
			String name=br.readLine();
			System.out.println("entercity:");
			String city=br.readLine();
			pst.setString(1,name);
			pst.setString(2,city);
			pst.executeUpdate();
			System.out.println("inserted");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
