package collections;

import java.util.*;

public class Queue_stack {
	Stack<Integer> s=new Stack<>();
	public boolean isempty()
	{
		return s.isEmpty();
	}
	public void add(int data)
	{
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		int val=s.pop();
		add(data);
		s.push(val);
	}
	public int pop()
	{
		if(s.isEmpty())
		{
			System.out.println("the queue is empty");
			return -1;
		}
		return s.pop();
	}
	public int peek()
	{
		if(s.isEmpty())
		{
			System.out.println("the queue is empty");
			return -1;
		}
		return s.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_stack qs=new Queue_stack();
		qs.add(1);
		qs.add(2);
		qs.add(3);
		qs.add(4);
		while(!qs.isempty())
		{
			System.out.println(qs.peek());
			qs.pop();
		}
		qs.pop();
	}

}
