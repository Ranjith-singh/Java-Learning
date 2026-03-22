package test;
import java.util.*;

public class test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		List<Integer> b=new ArrayList<>();
		List<Integer> c=new ArrayList<>();
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				b.add(a[i]);	
			}
			else
			{
				c.add(a[i]);
			}
		}
		int x=b.get(0);
		for(int i=1;i<b.size();i++)
		{
			if(x<b.get(i))
			{
				x=b.get(i);
			}
		}
		int y=c.get(0);
		for(int i=0;i<c.size();i++)
		{
			if(y>c.get(i))
			{
				y=c.get(i);
			}
		}
		if((-x)<y)
		{
			System.out.print(x+" ");
		}
		else
		{
			System.out.print(y+" ");
		}
		System.out.println("is the element closest to 0");
	}

}
