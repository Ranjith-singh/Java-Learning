package test;
import java.util.*;

public class test10 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows and columns");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<=0 || b<=0)
		{
			System.out.println("enter the positive no for "+(a<=0?"row":"column"));
		}
		else
		{
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					System.out.print("B ");
				}
				System.out.println();
			}
		}
	}

}
