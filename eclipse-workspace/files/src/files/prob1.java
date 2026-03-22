package files;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class prob1 {
	
public static void main(String args[])
{
	System.out.println("enter the String");
	Scanner sc=new Scanner(System.in);
	String s=new String();
	s=sc.nextLine();
	int[] arr=new int[100];
	for(int i=0;i<s.length();i++)
	{
		arr[i]=0;
	}
	char[] c=new char[s.length()];
	for(int i=0;i<s.length();i++)
	{
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				arr[i]=arr[i]+1;
			}
		}
	}
	Map<Character,Integer> m=new TreeMap<>();
	
	for(int i=0;i<s.length();i++)
	{
		m.put(s.charAt(i),arr[i]);
	}
	Set<Character> key=m.keySet();
	Collection<Integer> v=m.values();
	Iterator it=key.iterator();
	Iterator it1=v.iterator();
	while(it.hasNext())
	{
		System.out.println("The charecter "+it.next()+" is repeated "+it1.next()+" times");
	}
}
}