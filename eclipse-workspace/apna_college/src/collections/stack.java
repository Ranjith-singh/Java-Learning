package collections;

import java.util.*;

public class stack {
	
	public static void reverse(Stack<Integer> s)
	{
		if(s.isEmpty())
		{
			return;
		}
		int top=s.pop();
		reverse(s);
		pushatbottom(top,s);
	}
	
	public static void pushatbottom(int data,Stack<Integer> s)
	{
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		int top=s.pop();
		pushatbottom(data,s);
		s.push(top);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		pushatbottom(4,s);
		reverse(s);
		//s.peek();
		while(!s.isEmpty())
		{
			System.out.print(s.pop()+" ");
		}
		System.out.println();
	}

}
