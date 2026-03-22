package search;

public class s1 {
	
	public static int sorted_rotated_search(int a[],int x,int low,int high)
	{
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==x)
			{
				return mid; 
			}
			else if(a[low]<=a[mid])
			{
				if(a[low]<=x && x<a[mid])
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
				if(a[mid]<x && x<=a[high])
				{
					low=mid+1;
					high=mid-1;
				}
				else
				{
					high=mid-1;
				}
			}
		}
		return -1;
	}
	
	public static int ceil(int a[],int x,int low,int high)
	{
		int c=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==x)
			{
				return x;
			}
			else if(a[mid]>x)
			{
				c=a[mid];
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {100,200,300,400,20,30,40};
		int n=a.length;
		System.out.println(sorted_rotated_search(a,50,0,n-1));
		int a1[]= {12,67,90,100,300,399};
		System.out.println(ceil(a1,95,0,a1.length-1));
	}

}
