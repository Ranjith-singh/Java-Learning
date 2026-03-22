package search;

import java.util.Scanner;

public class binarysearch {
	
	public int Search(int x,int a[],int min,int max)
	{
		int mid;
		if(min<=max)
		{
			mid=(min+max)/2;
			if(a[mid]==x)
			{
				return mid;
			}
			else if(a[mid]<x)
			{
				min=mid+1;
				return new binarysearch().Search(x,a,min,max);
			}
			else
			{
				max=mid-1;
				return new binarysearch().Search(x,a,min,max);			
			}
		}
		return -1;
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
		int min,max;
		min=0;
		max=a.length-1;
		int z=new binarysearch().Search(x,a,min,max);
		if(z==-1)
		{
			System.out.println("the provided value not found");
		}
		else if(z==x)
		{
			System.out.println("the provided value found at index "+z);
		}
	}

}
