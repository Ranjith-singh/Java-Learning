package collections;

import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("ranjith",9110);
		hm.put("rahul",8310);
		hm.put("maa",9886);
		System.out.println(hm);
		hm.put("ranjith",8453);
		System.out.println(hm);
		System.out.println(hm.containsKey("ranjith"));
		System.out.println(hm.containsValue(9110));
		System.out.println(hm.get("rahul"));
		System.out.println(hm.get("dad"));
		System.out.println();
		for(Map.Entry<String,Integer> i:hm.entrySet())
		{
			System.out.println(i+" "+i.getKey()+" "+i.getValue());
		}
		System.out.println();
		// no Iterator func in it
		Set<String> keys =hm.keySet();
		for(String key:keys)
		{
			System.out.println(key+" "+hm.get(key));
		}
		System.out.println();
		hm.remove("maa");
		System.out.println(hm );
	}

}
