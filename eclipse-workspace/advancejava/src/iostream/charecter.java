package iostream;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class charecter {
	public static void main(String[] args) throws IOException
	{
		FileReader reader=null;
		FileWriter writer=null;
		// TODO Auto-generated method stub
		try {
			reader=new FileReader("C:\\files_demo\\ip1.txt");
			writer=new FileWriter("C:\\files_demo\\op1.txt");
			int content;
			while((content=reader.read())!=-1)
			{
				writer.write((byte)content);
			}
		}
		finally
		{
			if(reader!=null)
			{
				reader.close();
			}
			if(writer!=null)
			{
				writer.close();
			}
		}
		}
	}
