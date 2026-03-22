package jdbc;

import java.sql.*;

public class jdbc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","1995");
			String q="create table table1(tid int(20) primary key auto_increment,tname varchar(200) not null,tcity varchar(300))";
			Statement st=con.createStatement();
			st.executeUpdate(q);
			System.out.println("table created");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
