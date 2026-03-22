package recursion;

import java.util.ArrayList;
import java.util.List;

public class r4 {

	static class pair
    {
        int a;
        int b;
        pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }

	public static void change(int[] a,int b,int c,ArrayList<Integer> al)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=0;
		}
		b=0;
		c=0;
		al.add(4);
		return;
	}

	interface cl
	{
		static int c=10;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int b=10;
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		change(a,b,cl.c,al);
		for (int element : a) {
			System.out.print(element+" ");
		}
		System.out.println("\n"+b+" "+cl.c);
		System.out.println(al);
		List<pair> l=new ArrayList<>();
		l.add(new pair(2,3));
		System.out.println(l+" "+l.contains(new pair(2,3)));
	}

}
