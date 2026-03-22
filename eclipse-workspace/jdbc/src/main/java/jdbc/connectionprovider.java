package jdbc;

import java.sql.*;

public class connectionprovider {
	private static Connection con;
	
	public static Connection getConnection()
	{
		try
		{
			if(con==null)
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","1995");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
