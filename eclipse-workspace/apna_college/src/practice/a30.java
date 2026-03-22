package practice;

import java.util.*;

public class a30 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {10,2,-2,-20,10};
		int sum=0,ans=0;
		int k=-10;
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0,1);
		for(int j=0;j<a.length;j++)
		{
			sum=sum+a[j];
			if(map.containsKey(sum-k))
			{
				ans=ans+map.get(sum-k);
			}
			if(map.containsKey(sum))
			{
				map.put(sum,map.get(sum)+1);
			}
			else
			{
				map.put(sum,1);
			}
		}
		System.out.println(map);
		System.out.println(ans);
	}	

}
