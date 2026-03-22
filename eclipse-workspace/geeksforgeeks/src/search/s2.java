package search;

public class s2 {
	
	public static int peak(int a[],int n)
	{
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(mid>0 && (a[mid-1]>a[mid]))
			{
				high=mid-1;
			}
			else if(mid<n-1 && (a[mid+1]>a[mid]))
			{
				low=mid+1;
			}
			else
			{
				return a[mid];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,19};
		System.out.println(peak(a,a.length));
	}

}
