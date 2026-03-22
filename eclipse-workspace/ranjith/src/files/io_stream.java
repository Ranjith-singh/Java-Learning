package files;

import java.io.*;

/*input stream is used to read the input from the source i.e from socket or through user
output stream is used to write data on the screen or the moniter*/

public class io_stream {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		io_stream ios=new io_stream();
		//File f=new File("C:\\files\\message.txt");
		ios.writetofile(new File("C:\\files_demo\\message.txt"));
	}
	void writetofile(File filetowriteto) throws IOException
	{
		FileOutputStream fos=new FileOutputStream(filetowriteto);
		//fos.flush();
		fos.write("i am very brave".getBytes());
		fos.close();
	}

}
