package functions;

import java.util.*;

public class f2 {
	public static void odd(int n)
	{
		System.out.println("The sum of odd no's is "+n*n);
	}
	public static void odd1(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(2*i-1);
		}
		System.out.println("The sum of odd no's is "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of odd number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		odd(n);
		odd1(n);
		sc.close();
	}

}
