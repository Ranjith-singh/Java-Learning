package files;

import java.io.*;

public class fileinputstream {
	
	void readfrom(String filetoread) throws IOException
	{
		FileInputStream fis=new FileInputStream(filetoread);
		int intreadfromfile;
		while((intreadfromfile=fis.read())!=-1)
		{
			System.out.println("charecter read is="+(char)intreadfromfile);
		}
		fis.close();
	}

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		fileinputstream fis=new fileinputstream();
		fis.readfrom("C:\\files_demo\\message.txt"); 
	}

}
