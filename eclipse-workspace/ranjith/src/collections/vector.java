package collections;

import java.util.Vector;
import java.util.Iterator;

public class vector {
	
	public static void main(String args[])
	{
		Vector<String> v=new Vector<>();
		v.add("umesh");
		v.addElement("rahul");
		v.addElement("ranjith");
		//v.clear();
		if(v.contains("umesh"))
		{
			System.out.println("yes");
		}
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		}
}
