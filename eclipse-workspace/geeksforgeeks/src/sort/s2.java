package sort;

import java.util.ArrayList;
import java.util.Collections;

class point1 implements Comparable<point1>
{
	int x,y;
	point1(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int compareTo(point1 p)
	{
		return this.x-p.x;
	}
}

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<point1> list=new ArrayList<point1>();
		list.add(new point1(1,2));
		list.add(new point1(5,6));
		list.add(new point1(3,4));
		Collections.sort(list);
		for(point1 p:list)
		{
			System.out.println(p.x+" "+p.y);
		}
	}

}
