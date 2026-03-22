package files;

import java.io.*;
import java.util.ArrayList;

class vehicle implements Serializable
{
	int no_of_wheels;
	int milage;
	String car_name;
	transient int x;
	vehicle(String car_name,int no_of_wheels,int milage,int x)
	{
		this.car_name=car_name;
		this.no_of_wheels=no_of_wheels;
		this.milage=milage;
		this.x=x;
	}	
}

public class objectstream {

	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException
	{
		// TODO Auto-generated method stub
		vehicle bmw=new vehicle("bmw",4,10,11);
		/*
		 * new objectstream().serialize(new File("C:\\files_demo\\serialize.bin"), bmw);
		 * 
		 * new objectstream().serialize("C:\\files_demo\\serialize.bin", bmw);
		 */
		  objectstream oos=new objectstream(); 
		  File file=new File("C:\\files_demo\\serialize.bin");
		  oos.serialize(file, bmw);	
		  oos.deserialize(file);
	}
	private void serialize(File file,vehicle instance) throws FileNotFoundException,IOException
	{
		//fileoutputstream takes both file and String as its argument
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(instance);
		oos.flush();
		oos.close();
	}
	private void deserialize(File file) throws FileNotFoundException,IOException,ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		File file1=new File("C:\\files_demo\\serialize.txt");
		FileOutputStream fos1=new FileOutputStream(file1);
		//FileWriter fw=new FileWriter(file1);
		//fw.close();
		//PrintWriter pw=new PrintWriter(file1);
		vehicle vc=(vehicle)ois.readObject();
		ois.close();
		//fos1.write("i am a goodboy".getBytes());
		int i=0;
		//Integer j=10;
		//Integer k=new Integer(100);
		//ArrayList arr=new ArrayList();
		while(i<5)
		{
		fos1.write((vc.milage+" "+vc.car_name+" "+vc.no_of_wheels+"\n").getBytes());
		i+=1;
		}
		//fos1.close();
		//fw.write("\n"+vc.milage+" "+vc.car_name+" "+vc.no_of_wheels); fw.close();
		/* pw.append("\n"+vc.milage+" "+vc.car_name+" "+vc.no_of_wheels); pw.close(); */ 
		fos1.close();
		System.out.println("the name of the car is = "+vc.car_name);
		System.out.println("the wheels of the car are = "+vc.no_of_wheels);
		System.out.println("the milage of the car is = "+vc.milage);
		System.out.println("the x value of the car is = "+vc.x);
	}
}
