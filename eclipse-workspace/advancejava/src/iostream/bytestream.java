package iostream;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestream {
	public static void main(String[] args) throws IOException
	{
		FileInputStream ipstream=null;
		FileOutputStream opstream=null;
		// TODO Auto-generated method stub
		try {
			ipstream=new FileInputStream("C:\\files_demo\\ip.txt");
			opstream=new FileOutputStream("C:\\files_demo\\op.txt");
			int content;
			while((content=ipstream.read())!=-1)
			{
				opstream.write((byte)content);
			}
		}
		finally
		{
			if(ipstream!=null)
			{
				ipstream.close();
			}
			if(opstream!=null)
			{
				opstream.close();
			}
		}
		}
	}
