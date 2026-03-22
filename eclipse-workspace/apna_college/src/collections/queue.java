package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> p=new PriorityQueue<>();
		p.add(1);
		p.add(2);
		p.add(5);
		p.add(4);
		p.add(3);
		System.out.println(p);
		p.remove(2);
		System.out.println(p);
		p.remove(3);
		System.out.println(p);
		p.add(7);
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.addAll(p);
		System.out.println(ad);
		ad.addFirst(0);
		ad.addLast(9);
		System.out.println(ad);
	}

}
