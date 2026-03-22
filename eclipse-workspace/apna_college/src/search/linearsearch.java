package search;

import java.util.*;

public class linearsearch {

	public void Search(int x,int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(x==a[i])
			{
				System.out.println("the given no is found at index "+i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i;
		}
		System.out.println("enter the no to be searched");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		new linearsearch().Search(x, a);
	}

}
