package array;

import java.util.HashMap;

public class a7 {

	public static int majority(int a[],int n)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(!map.containsKey(a[i]))
			{
				map.put(a[i],1);
			}
			else
			{
				map.put(a[i],map.get(a[i])+1);
			}
		}
		int x=0;
		for(int i:map.keySet())
		{
			if(map.get(i)>n/2)
			{
				x=i;
				break;
			}
		}
		for(int i=0;i<n/2;i++)
		{
			if(a[i]==x)
			{
				return i;
			}
		}
		return -1;
	}

	//moree's voting algorithm
	public static int majority1(int a[],int n)
	{
		int res=0,c=1;
		for(int i=1;i<n;i++)
		{
			if(a[i]==a[res])
			{
				c++;
			}
			else
			{
				c--;
			}
			if(c==0)
			{
				res=i;
				c=1;
			}
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==a[res])
			{
				count++;
			}
		}
		if(count>n/2)
		{
			return res;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,7,6,8,6,6,6,6};
		System.out.println(majority(a,a.length)+" "+majority1(a,a.length));
	}

}