package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class point
{
	int x,y;
	point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}

class mycomp implements Comparator<point>
{
	public int compare(point p1,point p2)
	{
		return p1.x-p2.x;
	}
}

class even implements Comparator<Integer>
{
	public int compare(Integer a,Integer b)
	{
		return a%2-b%2;
	}
}

public class s1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {4,3,1,2};
		Arrays.sort(a,1,4);
		System.out.println(Arrays.toString(a));
		point p1[]= {new point(1,2),new point(5,6),new point(3,4)};
		Arrays.sort(p1,new mycomp());
		for(int i=0;i<p1.length;i++)
		{
			System.out.println(p1[i].x+" "+p1[i].y);
		}
		Integer a1[]= {1,2,3,4};
		Arrays.sort(a1,Collections.reverseOrder());
		System.out.println(Arrays.toString(a1));
		Arrays.sort(a1,new even());
		System.out.println(Arrays.toString(a1));
	}

}
