package collections;

import java.util.*;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		TreeSet<Integer> ts=new TreeSet<>();
		hs.add(2);
		hs.add(3);
		hs.add(5);
		hs.add(1);
		hs.add(2);
		hs.add(6);
		hs.add(7);
		hs.add(8);
		hs.add(9);
		hs.add(0);
		System.out.println(hs);
		lhs.addAll(hs);
		System.out.println(lhs);
		ts.addAll(hs);
		System.out.println(ts);
	}

}
