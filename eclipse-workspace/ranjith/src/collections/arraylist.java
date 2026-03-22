package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List returnedlist=new arraylist().createarraylist();
		new arraylist().printarraylist(returnedlist);
		System.out.println(returnedlist.get(0));
		new arraylist().printarraylist(returnedlist);
		//System.out.println(returnedlist.get(0));
	}
	private List createarraylist()
	{
		List<String> cars=new ArrayList<>();
		cars.add("bmw");
		cars.add("audi");
		cars.add("mercedies");
		return cars;
	}
	private void printarraylist(List passedlist)
	{
		Iterator it=passedlist.iterator();
		while(it.hasNext())	//here the passedlist of the type list and the passedlist.iterator()
//is of the type iterator which has similar functions as Scanner obj.  passedlist.iterator()==Scanner obj
		{
			System.out.println("print the value in the list "+it.next());
		}
		it.remove();
		System.out.println("\n");
	}
}
