package array;

public class a9 {

	public static boolean equilibrim(int a[],int n)
	{
		if(n==0)
		{
			return true;
		}
		int sum1=0,sum2=0;
		for(int i=0;i<n;i++)
		{
			sum1=sum1+a[i];
		}
		if(sum1==0)
		{
			return true;
		}
		for(int i=0;i<n;i++)
		{
			sum1=sum1-a[i];
			if(sum1==sum2)
			{
				return true;
			}
			sum2=sum2+a[i];
		}
		return false;
	}

	public static boolean part_3(int a[],int n)
	{
		int ls=0,rs=0,ms=0;
		for(int i=0;i<n;i++)
		{
			rs=rs+a[i];
		}
		for(int i=0;i<n;i++)
		{
			rs=rs-a[i];
			ls=ls+a[i];
			if((2*ls)==rs)
			{
				while(ms<rs)
				{
					i++;
					ms=ms+a[i];
					rs=rs-a[i];
					if(ms==rs)
					{
						return true;
					}
				}
				return false;
			}
		}
		return false;
	}

	public static int range(int a[],int b[])
	{
		int lr=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<lr)
			{
				lr=a[i];
			}
		}
		int rr=b[0];
		for(int i=1;i<b.length;i++)
		{
			if(b[i]>rr)
			{
				rr=b[i];
			}
		}
		int max=0,sum=0;
		for(int i=lr;i<=rr;i++)
		{
			int sum1=0;
			for(int j=0;j<a.length;j++)
			{
				if(i>=a[j] && i<=b[j])
				{
					sum1++;
				}
			}
			if(sum1>sum)
			{
				sum=sum1;
				max=i;
			}
		}
		return max;
	}

	public static int range1(int a[],int b[],int n)
	{
		int freq[]=new int[101];
		for(int i=0;i<n;i++)
		{
			freq[a[i]]++;
			freq[b[i]+1]--;
		}
		int maxi=100,max=0;
		for(int i=1;i<maxi;i++)
		{
			freq[i]=freq[i]+freq[i-1];
			if(freq[i]>freq[max])
			{
				max=i;
			}
		}
		return max;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {5,2,6,1,1,1,1,4};
		System.out.println(equilibrim(a,a.length)+" "+part_3(a,a.length));
		int left[]= {1,2,5,15};
		int right[]= {5,8,7,18};
		System.out.println(range(left,right)+" "+range1(left,right,left.length));
		String s=" ";
		System.out.println(s.contains(" "));
	}

}
