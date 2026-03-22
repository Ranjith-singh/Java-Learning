package jdbc;

import java.sql.*;

import javax.swing.*;

import java.io.*;

public class jdbc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Connection con=connectionprovider.getConnection();
			String q="insert into images(pic) values(?)";
			PreparedStatement pst=con.prepareStatement(q);
			JFileChooser jfc=new JFileChooser();
			jfc.showOpenDialog(null);
			File file=jfc.getSelectedFile();
			FileInputStream fis=new FileInputStream(file);
			pst.setBinaryStream(1,fis,fis.available());
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null,"success..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
