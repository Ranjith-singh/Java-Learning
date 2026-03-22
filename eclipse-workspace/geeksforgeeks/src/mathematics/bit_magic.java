package mathematics;

import java.util.HashMap;

public class bit_magic {

	public static void set(int n,int k)
	{
		n=n>>k-1;
		if((n&1)!=0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

	public static int countset(int n)
	{
		int count=0;
		while(n>0)
		{
			count=count+(n&1);
			n=n>>1;
		}
		return count;
	}

	public static int countset1(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n&(n-1);
		}
		return count;
	}

	public static int countset2(int n)
	{
		int t[]=new int[256];
		t[0]=0;
		for(int i=1;i<256;i++)
		{
			t[i]=t[i&(i-1)]+1;
		}
		return t[n&255]+t[(n>>8)&255]+t[(n>>16)&255]+t[(n>>24)];
	}

	public static boolean powerof2(int n)
	{
		if(n==0)
		{
			return false;
		}
		int count=0;
		while(n>0)
		{
			count=count+(n&1);
			n=n>>1;
		}
		if(count==1)
		{
			return true;
		}
		return false;
	}

	public static boolean powerof2_1(int n)
	{
		if(n==0)
		{
			return false;
		}
		n=n&(n-1);
		if(n==0)
		{
			return true;
		}
		return false;
	}

	public static boolean powerof2_2(int n)
	{
		return (n!=0 && (n&(n-1))==0);
	}

	public static void oddno(int[] a)
	{
		int n=0;
		for (int element : a) {
			int count=0;
			for (int element2 : a) {
				if(element==element2)
				{
					count++;
				}
			}
			if(count%2!=0 && element!=n)
			{
				System.out.print(element+" ");
				n=element;
			}
		}
		System.out.println();
	}
	public static void oddno1(int[] a)
	{
		int b=a[0];
		for(int i=1;i<a.length;i++)
		{
			b=b^a[i];
		}
		System.out.println(b);
	}

	public static void oddno2(int[] a)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(a[0],1);
		for(int i=1;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i],map.get(a[i])+1);
			}
			else
			{
				map.put(a[i],1);
			}
		}
		System.out.println(map);
		for(int i:map.keySet())
		{
			if((map.get(i)%2)!=0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void oddno3(int[] a)
	{
		int b=a[0];
		for(int i=1;i<a.length;i++)
		{
			b=b^a[i];
		}
		int c=0,d=0;
		int k=b&-b;
		for (int element : a) {
			if((element&k)!=0)
			{
				c=c^element;
			}
			else
			{
				d=d^element;
			}
		}
		System.out.println(c+" "+d);
	}
	public static void powerset(String s)
	{
		int n=s.length();
		int res=1<<n;
		for(int i=0;i<res;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i&(1<<j))!=0)
				{
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(5,3);
		System.out.println(countset(40)+" "+countset1(65535)+" "+countset2(65535));
		System.out.println(Integer.bitCount(7));
		System.out.println(powerof2(15)+" "+powerof2(1)+" "+powerof2(32)+" "+powerof2(40));
		System.out.println(powerof2_1(0)+" "+powerof2_1(1)+" "+powerof2_1(32)+" "+powerof2_1(40));
		System.out.println(powerof2_2(0)+" "+powerof2_2(1)+" "+powerof2_2(32)+" "+powerof2_2(40));
		int a[]= {1,1,1,1,2,2,2,3,4,3};
		oddno(a);
		oddno1(a);
		oddno2(a);
		oddno3(a);
		powerset("abc");
	}

}
