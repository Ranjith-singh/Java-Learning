package practice;

import java.util.*;

public class a26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//int nums[]= {1,2,3,1,4,5,2,1,3,1};
		int nums[]= {1,2};
		int n=nums.length;
		int a=n/3;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:nums)
		{
			if(map.containsKey(i))
			{
				map.put(i,map.get(i)+1);
			}
			else
			{
				map.put(i,1);
			}
		}
		System.out.println(map);
		Set<Integer> s=new HashSet<>();
		for(int i:map.keySet())
		{
			if(map.get(i)>a)
			{
				s.add(i);
			}
		}
		System.out.println(s);
	}

}
