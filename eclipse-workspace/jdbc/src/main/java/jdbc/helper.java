package jdbc;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;

import javax.imageio.*;
import javax.swing.*;

public class helper 
{
	public static ImageIcon getImageIconByID(int id,Connection con)
	{
		ImageIcon icon=null;
		try
		{
			String q="select pic from images where id=?";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setInt(1, id);
			ResultSet res=pst.executeQuery();
			if(res.next())
			{
				Blob b=res.getBlob("pic");
				InputStream is=b.getBinaryStream();
				BufferedImage image=ImageIO.read(is);
				Image img= image.getScaledInstance(300,200,300);
				icon=new ImageIcon(img);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return icon;
	}
}
