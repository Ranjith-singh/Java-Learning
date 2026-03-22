package collections;

import java.util.PriorityQueue;
import java.util.Queue;

//array Dqueue(double ended queue) is a concrete implementation of the Dqueue where Dqueue is a interface

public class Queuedemo {
	public static void main(String args[])
	{
		Queue result=new Queuedemo().createqueue();
		new Queuedemo().displayqueue(result);
		}

private Queue createqueue()
{
	Queue<Integer> pq=new PriorityQueue<>();
	pq.add(200);
	pq.add(100);
	pq.add(50);
	return pq;
}

private void displayqueue(Queue name)
{
	System.out.println("this is the peek method to retrive the top element "+name.peek());
	//peek means looking and the poll means pulling out
	System.out.println("this is the poll method to retrive the top element "+name.poll());
	System.out.println("this is the poll method to retrive the top element "+name.poll());
	System.out.println("this is the poll method to retrive the top element "+name.poll());
}
}