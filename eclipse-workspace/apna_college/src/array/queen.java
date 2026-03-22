package array;

public class queen 
{
	public static int queen_place(int a[][],int j)
	{
		if(j==a[0].length)
		{
			print_array(a);
			System.out.println();
			return 1;
		}
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(issafe(a,i,j))
			{
				a[i][j]=1;
				c=c+queen_place(a,j+1);
				a[i][j]=0;
			}
		}
		return c;
	}
	public static boolean issafe(int a[][],int i,int j)
	{
		int n=a.length;
		int m=a[0].length;
		for(int k=0;k<n;k++)
		{
			if(a[i][k]==1)
			{
				return false;
			}
			if(a[k][j]==1)
			{
				return false;
			}
		}
		int b=i,c=j;
		while(i>=0 && j>=0)
		{
			if(a[i--][j--]==1)
			{
				return false;
			}
		}
		i=b;
		j=c;
		while(i>=0 && j<m)
		{
			if(a[i--][j++]==1)
			{
				return false;
			}
		}
		i=b;
		j=c;
		while(i<n && j>=0)
		{
			if(a[i++][j--]==1)
			{
				return false;
			}
		}
		while(b<n && c<m)
		{
			if(a[b++][c++]==1)
			{
				return false;
			}
		}
		return true;
	}
	public static void print_array(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int n=5;
		int a[][]=new int[n][n];
		System.out.println(queen_place(a,0));
	}
}
