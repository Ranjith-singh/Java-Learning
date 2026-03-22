package recurssion;

import java.util.*;

public class r2 {
	
	public static int fib(int a,int b,int n)
	{
		int c=a+b;
		if(n==2)
		{
			return 1;
		}
		return c+fib(b,c,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the count of fib no's");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		int c=fib(a,b,n);
		System.out.println(c);
	}

}
