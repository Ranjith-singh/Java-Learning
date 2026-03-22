package array;

import java.util.ArrayList;

public class a3 {

	public static int delete(int a[],int n,int x)
	{
		int idx=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				idx=i;
				break;
			}
		}
		if(idx==0)
		{
			return n;
		}
		for(int i=n-1;i>idx;i--)
		{
			a[i-1]=a[i];
		}
		return n-1;
	}

	public static int largest(int a[],int n)
	{
		int idx=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]>a[idx])
			{
				idx=i;
			}
		}
		return idx;
	}

	public static int seclarge(int a[],int n)
	{
		int lar=0;
		int sec=-1;
		for(int i=1;i<n;i++)
		{
			if(a[i]>a[lar])
			{
				sec=lar;
				lar=i;
			}
			else if(a[i]<a[lar] && a[i]>a[sec])
			{
				sec=i;
			}
		}
		return sec;
	}

	public static boolean sorted(int a[],int n)
	{
		for(int i=1;i<n;i++)
		{
			if(a[i-1]>a[i])
			{
				return false;
			}
		}
		return true;
	}

	public static void reverse(int a[],int l,int n)
	{
		int low=l,high=n-1;
		while(low<high)
		{
			int temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,3,6,5};
		int n=a.length;
		n=delete(a,n,0);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n"+largest(a,n)+" "+seclarge(a,n)+" "+sorted(a,n));
		reverse(a,0,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		ArrayList<Integer> al=new ArrayList<>();
	}

}
