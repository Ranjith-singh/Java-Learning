package array;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class f3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashMap<Character,Character> map=new HashMap<>();
		map.put('{','}');
		map.put('[',']');
		map.put('(',')');
		map.put('<','>');
		Stack<Character> st=new Stack<>();
		int i;
		for(i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				st.push(s.charAt(i));
			}
			if(map.containsValue(s.charAt(i)))
			{
				if(st.isEmpty() || map.get(st.pop())!=s.charAt(i))
				{
					System.out.println("false");
					break;
				}
			}
		}
		if(!st.isEmpty() && i==s.length())
		{
			System.out.println("false");
		}
		else if(i==s.length())
		{
			System.out.println("true");
		}
	}

}
