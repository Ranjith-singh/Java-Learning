package jdbc;

import java.sql.*;
import java.io.*;

public class jdbc5 {

	public static void main(String[] args) 
	{
		try
		{
		// TODO Auto-generated method stub
		Connection con=connectionprovider.getConnection();
		String q="update table1 set tname=?, tcity=? where tid=?";
		PreparedStatement pst=con.prepareStatement(q);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter new name:");
		String name=br.readLine();
		System.out.println("enter new city:");
		String city=br.readLine();
		System.out.println("enter tid:");
		int tid=Integer.parseInt(br.readLine());
		pst.setString(1,name);
		pst.setString(2,city);
		pst.setInt(3, tid);
		pst.executeUpdate();
		System.out.println("done.......");
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
