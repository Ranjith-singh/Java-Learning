package sort;

public class mergesort {
	
	public static void conquare(int a[],int st,int mid,int ed)
	{
		int merge[]=new int[ed-st+1];
		int idx1=st;
		int idx2=mid+1;
		int x=0;
		while(idx1<=mid && idx2<=ed)
		{
			if(a[idx1]<=a[idx2])
			{
				merge[x++]=a[idx1++];
			}
			else
			{
				merge[x++]=a[idx2++];
			}
		}
		while(idx1<=mid)
		{
				merge[x++]=a[idx1++];
		}
		while(idx2<=ed)
		{
				merge[x++]=a[idx2++];
		}
		for(int i=0,j=st;i<merge.length;i++,j++)
		{
			a[j]=merge[i];
		}
	}
	
	public static void divide(int a[],int st,int ed)
	{
		if(st==ed)
		{
			return;
		}
		int mid=st+ed/2;
		divide(a,st,mid);
		divide(a,mid+1,ed);
		conquare(a,st,mid,ed);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,1,4,2,6,5};
		int n=a.length;
		divide(a,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
