package search;

import java.util.*;

public class fibonnacci {
	
	public static int min(int x,int y)
	{
		return (x<y)?x:y;
	}
	public static int fibMonaccianSearch(int arr[],int x,int n)
	{
		int fibMMm2=0;
		int fibMMm1=1;
		int fibM=fibMMm2+fibMMm1;
		while(fibM<n)
		{
			fibMMm2=fibMMm1;
			fibMMm1=fibM;
			fibM=fibMMm1+fibMMm2;
		}
		int offset=-1;
		while(fibM>1)
		{
			int i=min(offset+fibMMm2,n-1);
			if(arr[i]<x)
			{
				fibM=fibMMm1;
				fibMMm1=fibMMm2;
				fibMMm2=fibM-fibMMm1;
				offset=i;
			}
			else if(arr[i]>x)
			{
				fibM=fibMMm2;
				fibMMm1=fibMMm1-fibMMm2;
				fibMMm2=fibM-fibMMm1;
			}
			else
				return i;
		}
	if(fibMMm1==1 && arr[n-1]==x)
		return n-1;
	return -1;
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		System.out.println("enter the element to be searched");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int ind=fibMonaccianSearch(arr,x,arr.length);
		System.out.println("The element is found at index "+ind);
	}

}
