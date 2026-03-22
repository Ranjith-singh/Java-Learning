package collections;

import java.util.*;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		hs.add(3);
		hs.add(2);
		hs.add(1);
		hs.add(1);
		System.out.println(hs.size());
		System.out.println(hs);
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
