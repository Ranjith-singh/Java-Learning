package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class iodemo {
	
	public static void main(String args[]) throws FileNotFoundException //throws Exception
	{
		File file=new File("C:\\files_demo\\employeeinfo.txt");// here "file" is the file discriptor
		iodemo demo=new iodemo();
		demo.writetofile(file);
		File file1=new File("C:\\files_demo\\vehicleinfo.txt");
		demo.readfile(new File("C:\\files_demo\\employeeinfo.txt"));
	}
	public void writetofile(File filetowrite) //throws Exception
	{
		PrintWriter empinfo=null;
		try
		{
		empinfo=new PrintWriter(filetowrite);//here printwriter is the class in the io package
		empinfo.println("binod");			 //and the arg passed to it is the file discriptor of file that u want write
		empinfo.println("100");
		}
		catch(FileNotFoundException f)
		{
			System.out.println("given file was not found in local disk C"+filetowrite.getName());
			throw new RuntimeException(f);
		}
		finally
		{
			empinfo.close();
		}
	}
	public void readfile(File filetoread) throws FileNotFoundException
	{
		Scanner input=new Scanner(filetoread);//here Scanner is the class in the java.util.Scanner package
		while(input.hasNext())				  //and the arg passed to it is the file discriptor of file that u want read
		{
		System.out.println("the line read is ="+input.nextLine());
		}
	}
}
