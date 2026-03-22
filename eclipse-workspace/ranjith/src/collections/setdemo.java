package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;	//duplicate values doesn't occur
import java.util.TreeSet;
//simalar to set map can also be used like hashmap,linkedhashmap
//hashmap can have mutiple null values but only one null key but in hashtable key cannot have null value 

public class setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setdemo st=new setdemo();
		Set s1=st.hashset();
		Set s2=st.Linkedhashset();
		Set s3=st.treeset();
		st.display(s1);
		st.display(s2);
		st.display(s3);
	}
	
	private Set hashset()
	{
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(70);
		set.add(90);
		set.add(20);
		set.add(40);
		set.add(60);
		set.add(80);
		set.add(10);
		return set;	
	}
	
	private Set Linkedhashset()
	{
		Set<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(70);
		set.add(90);
		set.add(20);
		set.add(40);
		set.add(60);
		set.add(80);
		set.add(10);
		return set;
	}
	//treeset sorts the set
	private Set treeset()
	{
		Set<Integer> set=new TreeSet<>();
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(70);
		set.add(90);
		set.add(20);
		set.add(40);
		set.add(60);
		set.add(80);
		set.add(10);
		return set;
	}
	private void display(Set result)
	{
		Iterator it=result.iterator();
		System.out.println("the order is");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
