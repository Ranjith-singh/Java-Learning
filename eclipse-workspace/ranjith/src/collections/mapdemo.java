package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mapdemo().display(new mapdemo().createhashmap());
		new mapdemo().display(new mapdemo().createlinkedhashmap());
		new mapdemo().display(new mapdemo().createtreemap());
	}
	
	private  Map createhashmap()
	{
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"rahul");
		map.put(3,"ranjith");
		map.put(5,"rocky");
		map.put(7,"r");
		map.put(9,"ran");
		map.put(2,"rock");
		map.put(4,"rohan");
		map.put(6,"santhosh");
		map.put(8,"ravi");
		map.put(1,"rahul");
		return map;
	}
	private  Map createlinkedhashmap()
	{
		Map<Integer,String> map=new LinkedHashMap<>();
		map.put(1,"rahul");
		map.put(3,"ranjith");
		map.put(5,"rocky");
		map.put(7,"r");
		map.put(9,"ran");
		map.put(2,"rock");
		map.put(4,"rohan");
		map.put(6,"santhosh");
		map.put(8,"ravi");
		map.put(1,"rahul");
		return map;
	}
	private  Map createtreemap()
	{
		Map<Integer,String> map=new TreeMap<>();
		map.put(1,"rahul");
		map.put(3,"ranjith");
		map.put(5,"rocky");
		map.put(7,"r");
		map.put(9,"ran");
		map.put(2,"rock");
		map.put(4,"rohan");
		map.put(6,"santhosh");
		map.put(8,"ravi");
		map.put(1,"rahul");
		return map;
	}
	
	private void display(Map<Integer,String> result)
	{
		Set keys=result.keySet();
		//Set values=(Set) result.values(); //explicit convertion
		System.out.println(result);
		System.out.println(keys);
		//System.out.println(values);
	}

}
