package recurssion;

import java.util.*;

public class r1 {
	
	public static void fib(int[] a,int i,int n)
	{
		if(n==0)
		{
			return;
		}
		a[i]=a[i-1]+a[i-2];
		fib(a,i+1,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the count of fib no's");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[10];
		a[0]=0;
		a[1]=1;
		fib(a,2,n-2);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
