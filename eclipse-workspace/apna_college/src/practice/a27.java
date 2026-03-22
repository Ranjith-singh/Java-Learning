package practice;

import java.util.*;

public class a27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {2,4,6,7,2};
		Set<Integer> s=new HashSet<>();
		Set<Integer> s1=new HashSet<>();
		Set<Integer> s2=new HashSet<>();
		for(int i:arr1)
		{
			s.add(i);
		}
		for(int i:arr2)
		{
			s.add(i);
		}
		System.out.println(s.size()+" "+s);
		for(int i:arr2)
		{
			s1.add(i);
		}
		for(int i:arr1)
		{
			if(s1.contains(i))
			{
				s2.add(i);
			}
		}
		System.out.println(s2.size()+" "+s2);
	}

}
