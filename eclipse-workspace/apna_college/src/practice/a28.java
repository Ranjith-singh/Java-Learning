package practice;

import java.util.*;

public class a28 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<>();
		Set<String> set=new HashSet<>();
		map.put("chennai","bangalore");
		map.put("mumbai","delhi");
		map.put("goa","chennai");
		map.put("delhi","goa");
		for(String s:map.keySet())
		{
			set.add(map.get(s));
		}
		String b=null;
		for(String s:map.keySet())
		{
			if(!set.contains(s))
			{
				b=s;
				break;
			}
		}
		System.out.print(b);
		while(map.containsKey(b))
		{
			b=map.get(b);
			System.out.print("->"+b);
		}
	}

}
