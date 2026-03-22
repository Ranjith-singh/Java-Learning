package jdbc;

import java.sql.*;

import java.io.*;

public class jdbc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Connection con=connectionprovider.getConnection();
			String q="insert into images(pic) values(?)";
			PreparedStatement pst=con.prepareStatement(q);
			FileInputStream fis=new FileInputStream("d2.png");
			pst.setBinaryStream(1,fis,fis.available());
			pst.executeUpdate();
			System.out.println("done..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
