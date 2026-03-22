package array;

public class a13 {
	
	public static int a(int a[],int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==1)
			{
				sum++;
			}
			else 
			{
				sum--;
			}
		}
		int p1=0;
		for(int i=0;i<n;i++)
		{
			if(p1>sum)
			{
				return i;
			}
			if(a[i]==1)
			{
				p1++;
				sum--;
			}
			else 
			{
				p1--;
				sum++;
			}
		}
		if(p1>sum)
		{
			return n;
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {1,1,0,1};
		System.out.println(a(a,a.length));
	}

}
