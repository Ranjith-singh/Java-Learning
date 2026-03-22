package hashing;

public class h1 {

	public static int binary_search(int a[],int n,int x)
	{
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==x)
			{
				return mid;
			}
			else if(a[mid]<x)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
	}

	public static int binary_search(int a[],int low,int n,int x)
	{
		int high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==x)
			{
				return mid;
			}
			else if(a[mid]<x)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
	}

	public static int bs_1(int a[],int low,int high,int x)
	{
		if(low>high)
		{
			return -1;
		}
		int mid=(low+high)/2;
		if(a[mid]==x)
		{
			return mid;
		}
		if(a[mid]>x)
		{
			return bs_1(a,low,mid-1,x);
		}
		return bs_1(a,mid+1,high,x);
	}

	public static int occurance_1st(int a[],int n,int x)
	{
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]<x)
			{
				low=mid+1;
			}
			else if(a[mid]>x)
			{
				high=mid-1;
			}
			else
			{
				if(mid==0 || a[mid-1]!=a[mid])
				{
					return mid;
				}
				else
				{
					high=mid-1;
				}
			}
		}
		return -1;
	}

	public static int occurance_last(int a[],int n,int x)
	{
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]<x)
			{
				low=mid+1;
			}
			else if(a[mid]>x)
			{
				high=mid-1;
			}
			else
			{
				if(mid==n-1 || a[mid+1]!=a[mid])
				{
					return mid;
				}
				else
				{
					low=mid+1;
				}
			}
		}
		return -1;
	}

	public static int count(int a[],int n,int x)
	{
		int b=binary_search(a,n,x);
		if(b==-1)
		{
			return -1;
		}
		int count=1;
		for(int i=b;i>0 && (a[i]==a[i-1]);i--)
		{
			count++;
		}
		for(int i=b;i<n-1 && (a[i]==a[i+1]);i++)
		{
			count++;
		}
		return count;
	}

	public static int count_1(int a[],int n,int x)
	{
		int b=occurance_1st(a,n,7);
		if(b==-1)
		{
			return 0;
		}
		return occurance_last(a,n,7)-b+1;
	}

	public static int count1(int a[],int n)
	{
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==0)
			{
				low=mid+1;
			}
			else
			{
				if(mid==0 || a[mid-1]==0)
				{
					return n-mid;
				}
				else
				{
					high=mid-1;
				}
			}
		}
		return 0;
	}

	public static int sqrt(int n)
	{
		int low=1,high=n;
		int ans=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			int msq=mid*mid;
			if(msq==n)
			{
				return mid;
			}
			else if(msq>n)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
				ans=mid;
			}
		}
		return ans;
	}

	public static int infinite(int a[],int x)
	{
		int high=Math.min(x-1,a.length),low=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==x)
			{
				return mid;
			}
			else if(a[mid]<x)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
	}

	public static int infinite_1(int a[],int x)
	{
		if(a[0]==x)
		{
			return 0;
		}
		int i=1;
		while(a[i]<x)
		{
			i=i*2;
		}
		if(a[i]==x)
		{
			return i;
		}
		return binary_search(a,(i/2)+1,i-1,x);
	}

	public static int rotate(int a[],int n,int x)
	{
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			System.out.println(mid);
			if(a[mid]==x)
			{
				return mid;
			}
			if(a[low]<=a[mid])
			{
				if(a[low]<=x && x<=a[mid-1])
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
			else
			{
				if(a[mid+1]<=x && x<=a[high])
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,7,7,7,7,7,8,9,10};
		int n=a.length;
		System.out.println(binary_search(a,n,7)+" "+bs_1(a,0,n-1,7)+" "+occurance_1st(a,n,7)+" "+occurance_last(a,n,7));
		System.out.println(count(a,n,7)+" "+count_1(a,n,7));
		int a1[]= {0,0,0,0,1,1,1,1,1};
		int n1=a1.length;
		System.out.println(count1(a1,n1));
		System.out.println(sqrt(15));
		int a2[]=new int[100];
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=i*2;
		}
		System.out.println(infinite(a2,100)+" "+infinite(a2,100));
		int a3[]= {6,5,4,3,2,1};
		System.out.println(rotate(a3,a3.length,2));
	}

}
