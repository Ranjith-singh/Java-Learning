package array;

public class a4 {

	public static int removedup(int a[],int n)
	{
		int temp[]=new int[n];
		int ans=1;
		for(int i=1;i<n;i++)
		{
			if(a[ans-1]!=a[i])
			{
				a[ans]=a[i];
				ans++;
			}
		}
		return ans;
	}

	public static void movezero(int a[],int n)
	{
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				a[c]=a[i];
				c++;
			}
		}
		for(int i=c;i<n;i++)
		{
			a[i]=0;
		}
	}

	public static void movezero1(int a[],int n)
	{

		int c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[c];
				a[c]=a[i];
				a[i]=temp;
				c++;
			}
		}
	}

	public static void leftrotateby1(int a[],int n)
	{
		int c=a[0];
		for(int i=1;i<n;i++)
		{
			a[i-1]=a[i];
		}
		a[n-1]=c;
	}

	public static void leftrotatebyd(int a[],int n,int d)
	{
		int a1[]=new int[d];
		for(int i=0;i<d;i++)
		{
			a1[i]=a[i];
		}
		for(int i=0;d+i<n;i++)
		{
			a[i]=a[d+i];
		}
		for(int i=n-d,k=0;i<n;i++,k++)
		{
			a[i]=a1[k];
		}
	}

	public static void leftrotatebyd_1(int a[],int n,int d)
	{
		a3.reverse(a,0,d);
		a3.reverse(a,d,n);
		a3.reverse(a,0,n);
	}

	public static void print(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {1,1,1,2,2,2,3,3};
		int n=removedup(a,a.length);
		print(a,n);
		int a1[]= {0,0,1,2,3,4};
		movezero1(a1,a1.length);
		print(a1,a1.length);
		leftrotateby1(a1,a1.length);
		print(a1,a1.length);
		leftrotatebyd(a1,a1.length,3);
		print(a1,a1.length);
		leftrotatebyd_1(a1,a1.length,3);
		print(a1,a1.length);
	}

}
