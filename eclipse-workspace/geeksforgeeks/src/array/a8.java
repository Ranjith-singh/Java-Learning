package array;

public class a8 {

	public static void min_flips(int a[],int n)
	{
		int idx=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==a[0])
			{
				if(idx<=(i-1))
				{
					System.out.println("flip from index "+idx+" to index "+(i-1)+" to "+a[0]);
					idx=i;
				}
				idx++;
			}
		}
		if(a[n-1]!=a[0])
		{
			System.out.println("flip from index "+idx+" to index "+(n-1)+" to "+a[0]);
		}
	}

	public static int k_sum(int a[],int n,int k)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i+k-1<n;i++)
		{
			int sum=0;
			for(int j=0;j<k;j++)
			{
				sum=sum+a[i+j];
			}
			max=Math.max(max,sum);
		}
		return max;
	}

	public static int k_sum1(int a[],int n,int k)
	{
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		max=Math.max(max,sum);
		for(int i=0,j=k;j<n;i++,j++)
		{
			sum=sum-a[i]+a[j];
			max=Math.max(max,sum);
		}
		return max;
	}

	public static boolean sub_sum(int a[],int n,int num)
	{
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+a[j];
				if(sum==num)
				{
					return true;
				}
			}
		}
		return false;
	}

	public static boolean sub_sum1(int a[],int n,int num)
	{
		int sum=0;
		int s=0;
		for(int e=0;e<n;e++)
		{
			num=num+a[e];
			while(num>sum)
			{
				num=num-a[s];
				s++;
			}
			if(sum==num)
			{
				return true;
			}
		}
		return false;
	}

	public static int[] prefix_sum(int a[],int n)
	{
		final int sum[]=new int[n];
		sum[0]=a[0];
		for(int i=1;i<n;i++)
		{
			sum[i]=sum[i-1]+a[i];
			System.out.print(sum[i]+" ");
		}
		System.out.println();
		return sum;
	}

	public static int pre_sum(int a,int b,int sum[])
	{
		if(a==0)
		{
			return sum[b];
		}
		return sum[b]-sum[a-1];
	}

	public static int[] Wprefix_sum(int a[],int n)
	{
		int sum1[]=new int[n];
		sum1[0]=a[0];
		for(int i=1;i<n;i++)
		{
			sum1[i]=(i+1)*a[i]+sum1[i-1];
			System.out.print(sum1[i]+" ");
		}
		System.out.println();
		return sum1;
	}

	public static int Wget_sum(int a,int b,int sum[],int sum1[])
	{
		if(a==0)
		{
			return sum1[b];
		}
		return sum1[b]-(a-1)*pre_sum(a,b,sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,0,1,1,1,0,1,1,1};
		min_flips(a,a.length);
		int a1[]= {10,5,-2,20,1};
		System.out.println(k_sum(a1,a1.length,2)+" "+k_sum1(a1,a1.length,2));
		int a2[]= {3,2,0,4,7};
		System.out.println(sub_sum(a2,a2.length,6)+" "+sub_sum1(a2,a2.length,6));
		int a3[]= {2,3,5,4,6,1};
		int sum[]=prefix_sum(a3,a3.length);
		System.out.println(pre_sum(0,2,sum)+" "+pre_sum(2,3,sum)+" "+pre_sum(2,5,sum));
		int sum1[]=Wprefix_sum(a3,a3.length);
		System.out.println(Wget_sum(2,3,sum,sum1));
	}

}
