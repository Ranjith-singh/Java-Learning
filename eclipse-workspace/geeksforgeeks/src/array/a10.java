package array;

public class a10 {

	public static void rotate_left(int a[],int n,int d)
	{
		reverse(a,0,d-1);
		reverse(a,d,n-1);
		reverse(a,0,n-1);
		print(a);
	}

	public static void rotate_left1(int a[],int n,int d)
	{
		int temp[]=new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i]=a[i];
		}
		for(int i=d;i<n;i++)
		{
			a[i-d]=a[i];
		}
		for(int i=0;i<d;i++)
		{
			a[i+n-d]=temp[i];
		}
		print(a);
	}

	public static void rotate_right(int a[],int n,int d)
	{
		reverse(a,0,n-d-1);
		reverse(a,n-d,n-1);
		reverse(a,0,n-1);
		print(a);
	}

	public static void reverse(int a[],int low,int high)
	{
		int temp=0;
		while(high>low)
		{
			temp=a[high];
			a[high--]=a[low];
			a[low++]=temp;

		}
	}

	public static void print(int a[])
	{
		for (int element : a) {
			System.out.print(element+" ");
		}
		System.out.println();
	}

	public static void leaders(int a[],int n)
	{
		if(n==0)
		{
			return;
		}
		int led=a[n-1];
		System.out.print(led+" ");
		for(int i=n-2;i>=0;i--)
		{
			if(a[i]>led)
			{
				led=a[i];
				System.out.print(led+" ");
			}
		}
		System.out.println();
	}

	public static int max_diff(int a[],int n)
	{
		int left[]=new int[n];
		int right[]=new int[n];
		left[0]=a[0];
		right[n-1]=a[n-1];
		for(int i=1,j=n-2;i<n;i++,j--)
		{
			left[i]=Math.min(left[i-1],a[i]);
			right[j]=Math.max(right[j+1],a[j]);
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			max=Math.max(max,right[i]-left[i]);
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,2,0,0,3,0,4,0};
		int n=a.length;
		int res=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]=a[res];
				a[res]=temp;
				res++;
			}
		}
		print(a);
		rotate_left(a,n,2);
		rotate_right(a,n,2);
		rotate_left1(a,n,2);
		leaders(a,n);
		System.out.println(max_diff(a,n));
	}

}
