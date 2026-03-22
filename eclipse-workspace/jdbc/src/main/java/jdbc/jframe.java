package jdbc;

import java.awt.Color;

import javax.swing.*;

public class jframe 
{
	public static void main(String args[])
	{
		JFrame frame=new JFrame();
		frame.setTitle("My frame");
		frame.setSize(500,500);
		frame.setVisible(true);
		ImageIcon image=new ImageIcon("d2.png");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(Color.blue);
		}
}
