package test;
import java.util.*;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		int j=0,k=0;
		Integer x,y;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				j++;
			}
			else
			{
				k++;
			}
		}
		int b[]=new int[j];
		int c[]=new int[k];
		j=0;k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				b[j]=a[i];	
				j++;
			}
			else
			{
				c[k]=a[i];
				k++;
			}
		}
		x=b[0];
		for(int i=1;i<b.length;i++)
		{
			if(x<b[i])
			{
				x=b[i];
			}
		}
		y=c[0];
		for(int i=0;i<c.length;i++)
		{
			if(y>c[i])
			{
				y=c[i];
			}
		}
		if((-x)<y)
		{
			System.out.print(x+" ");
		}
		else if((-x)<y)
		{
			System.out.print(y+" ");
		}
		System.out.println("is the element closest to 0");
	}

}
