package collections;

import java.util.*;
import java.io.*;
import java.util.LinkedList;
import java.util.Vector;
import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		LinkedList<Integer> list2=new LinkedList<>();
		Vector<Integer> list3=new Vector<>();
		HashSet<Integer> set=new HashSet<>();
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(7);
		list.add(2,1);
		list.get(1);
		System.out.println(list.indexOf(2));
		System.out.println(list);
		System.out.println(list.get(0));
		list.set(0, 5);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);
		list.addAll(1,list);
		System.out.println(list);
		System.out.println(list.lastIndexOf(2));
		list2.addFirst(1);
		list2.addFirst(2);
		list2.addLast(3);
		list2.add(4);
		System.out.println(list2);
		list3.addAll(list);
		System.out.println(list3);
		set.addAll(list);
		System.out.println(set);
		list3.addAll(set);
		System.out.println(list3);
	}

}
