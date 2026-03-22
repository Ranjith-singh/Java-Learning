package ranjith;
import java.util.*;

public class switchstmt {
	public static void main (String args[])
	{
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int[] a=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=i;
		}
		//for each version
		for(long i:a)	//implicit convertion
		{
			System.out.println(i);
		}
		switch(b)
		{
		case 1:
		{
			System.out.println("hi");
			break;
		}
		case 2:
		{
			System.out.println("hello");
			break;
		}	
		}
	}
}
