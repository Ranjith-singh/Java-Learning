package hashing;

public class h2 {

	public static int peak(int a[],int n)
	{
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if((mid==0 || a[mid]>=a[mid-1]) && (mid==n-1 || a[mid]>=a[mid+1]))
			{
				return a[mid];
			}
			if(mid!= 0 && a[mid-1]>=a[mid])
			{
				high=mid+1;
			}
			else
			{
				low=mid+1;
			}
		}
		return -1;
	}

	public static boolean pair(int a[],int n,int x)
	{
		int low=0,high=n-1;
		while(low<high)
		{
			System.out.println(low+" "+high);
			if(a[low]+a[high]==x)
			{
				return true;
			}
			else if(a[low]+a[high]<x)
			{
				low++;
			}
			else
			{
				high--;
			}
		}
		return false;
	}

	public static float median(int a[],int b[])
	{
		int n=a.length,m=b.length;
		int x=m+n;
		int c[]=new int[x];
		int i=0,j=0,k=0;
		while(i!=n && j!=m)
		{
			if(a[i]<=b[j])
			{
				c[k++]=a[i++];
			}
			else
			{
				c[k++]=b[j++];
			}
		}
		while(i!=n)
		{
			c[k++]=a[i++];
		}
		while(j!=m)
		{
			c[k++]=b[j++];
		}
		if(x%2==0)
		{
			return (float)(c[x/2]+c[(x/2)-1])/2;
		}
		return c[x/2];
	}

	public static float median_1(int a[],int b[])
	{
		int n1=a.length;
		int n2=b.length;
		int low=0,high=n1-1;
		while(low<=high)
		{
			int mid1=(low+high)/2;
			int mid2=((n1+n2+1)/2)-mid1;
			if(a[mid1]>=b[mid2-1])
			{
				return (float)(a[mid1]+b[mid2])/2;
			}
			else
			{
				low=mid1;
			}
		}
		return -1.0f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,15,5,23,90,67};
		int n=a.length;
		System.out.println(peak(a,n));
		int a1[]= {10,20,30,40,50};
		System.out.println(pair(a1,a1.length,18));
		int a2[]= {5,15,25,35,45};
		System.out.println(median(a1,a2));
	}

}
