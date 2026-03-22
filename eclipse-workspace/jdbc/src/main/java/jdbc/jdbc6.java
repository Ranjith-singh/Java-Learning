package jdbc;

import java.sql.*;

public class jdbc6 {
	
	public static void main(String args[])
	{
		try
		{
		Connection con=connectionprovider.getConnection();
		String q="select * from table1";
		Statement st=con.createStatement();
		ResultSet res=st.executeQuery(q);
		while(res.next())
		{
			System.out.println("the id "+res.getInt(1)+" name is "+res.getString(2)+" lives in "+res.getString(3));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
