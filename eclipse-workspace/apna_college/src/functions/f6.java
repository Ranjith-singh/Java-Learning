package functions;

import java.util.*;

public class f6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the count of numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int a[]=new int[10];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<n;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
