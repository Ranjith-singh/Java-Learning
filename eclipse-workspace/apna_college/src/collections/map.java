package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<>();
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		TreeMap<Integer,String> tm=new TreeMap<>();
		Hashtable<Integer,String> ht=new Hashtable<>();
		hm.put(1,"raju");
		hm.put(0,"raj");
		hm.put(2,"rajul");
		hm.put(3,"w");
		hm.put(4,"q");
		hm.put(5,"w");
		hm.put(1,"0aju");
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		lhm.putAll(hm);
		System.out.println(lhm);
		tm.putAll(hm);
		System.out.println(tm);
		ht.putAll(hm);
		System.out.println(ht);
		
	}

}
