package practice;

import java.util.*;

public class a29 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {10,2,-2,-20,10};
		int n=a.length;
		int k=-10;
		int count=0;
		HashMap<Integer,Set<Integer>> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			for(int b=0;b<=i;b++)
			{
				int sum=0;
				Set<Integer> set=new HashSet<>();
				for(int j=b;j<n-i+b;j++)
				{
					set.add(a[j]);
					sum+=a[j];
				}
				//System.out.println(sum+" "+set);
				if(sum==k)
				{
					map.put(count,set);
					count++;
				}
			}
		}
		for(int i:map.keySet())
		{
			System.out.println(map.get(i));
		}
	}

}
