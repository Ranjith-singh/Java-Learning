package array;

import java.util.HashMap;

public class a5 {

	public static void leader(int a[],int n)
	{
		int curr_lead=a[n-1];
		System.out.print(curr_lead+" ");
		for(int i=n-2;i>=0;i--)
		{
			if(a[i]>curr_lead)
			{
				System.out.print(a[i]+" ");
				curr_lead=a[i];
			}
		}
		System.out.println();
	}

	public static int max_diff(int a[],int n)
	{
		int max=0,curr=0;
		for(int i=n-1;i>0;i--)
		{
			if((a[i]-a[i-1])>0)
			{
				curr=curr+(a[i]-a[i-1]);
				if(curr>max)
				{
					max=curr;
				}
			}
			else
			{
				curr=0;
			}
		}
		return max;
	}

	public static int max_diff1(int a[],int n)
	{
		int max=a[1]-a[0],min_val=a[0];
		for(int i=1;i<n;i++)
		{
			max=Math.max(max,a[i]-min_val);
			min_val=Math.min(min_val,a[i]);
		}
		return max;
	}

	public static void frequency(int a[],int n)
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
		for(int i:map.keySet())
		{
			System.out.println(i+" "+map.get(i));
		}
	}

	public static int stock(int a[],int n)
	{
		int sum=0;
		int max=0;
		int min_val=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]<a[i-1])
			{
				min_val=a[i];
				sum=sum+max;
				max=0;
			}
			max=Math.max(a[i]-min_val,max);
			min_val=Math.min(min_val,a[i]);
		}
		if(max>0)
		{
			sum=sum+max;
		}
		return sum;
	}

	public static int stock1(int a[],int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]>a[i-1])
			{
				sum=sum+(a[i]-a[i-1]);
			}
		}
		return sum;
	}

	public static int trapping_rain(int a[],int n)
	{
		int sum=0;
		for(int i=1;i<n-1;i++)
		{
			int lmax=a[i];
			for(int j=0;j<i;j++)
			{
				lmax=Math.max(lmax,a[j]);
			}
			int rmax=a[i];
			for(int j=i+1;j<n;j++)
			{
				rmax=Math.max(rmax,a[j]);
			}
			sum=sum+(Math.min(lmax,rmax)-a[i]);
		}
		return sum;
	}

	public static int trapping_rain1(int a[],int n)
	{
		int lmax[]=new int[n];
		int rmax[]=new int[n];
		int sum=0;
		lmax[0]=a[0];
		for(int i=1;i<n;i++)
		{
			lmax[i]=Math.max(lmax[i-1],a[i]);
		}
		rmax[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			rmax[i]=Math.max(rmax[i+1],a[i]);
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+(Math.min(lmax[i],rmax[i])-a[i]);
		}
		return sum;
	}

	public static int consicutive_1(int a[],int n)
	{
		int sum=0;
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==1)
			{
				max++;
			}
			else
			{
				sum=Math.max(max,sum);
				max=0;
			}
		}
		return sum;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {7,10,4,10,6,5,2};
		leader(a,a.length);
		int a1[]= {13,2,3,10,6,4,8,1};
		System.out.println(max_diff(a1,a1.length)+" "+max_diff1(a1,a1.length));
		int a2[]= {10,10,10,25,30,30};
		frequency(a2,a2.length);
		int a3[]= {3,1,2};
		System.out.println(stock(a3,a3.length)+" "+stock1(a3,a3.length));
		System.out.println(trapping_rain(a3,a3.length)+" "+trapping_rain1(a3,a3.length));
		int a4[]= {1,0,1,1,1,1,0,1,1};
		System.out.println(consicutive_1(a4,a4.length));
	}

}
