package collections;

public class queuell 
{
	public Node rear=null,front=null;
		public class Node
		{
			int data;
			Node next;
			Node(int data)
			{
				this.data=data;
				next=null;
			}
		}
		public boolean isempty()
		{
			return front==null;
		}
		public void add(int n)
		{
			Node newnode=new Node(n);
			if(isempty())
			{
				rear=front=newnode;
				return;
			}
			rear.next=newnode;
			rear=newnode;
		}
		public int remove()
		{
			if(isempty())
			{
				System.out.println("the queue is empty");
				return -1;
			}
			int val=front.data;
			front=front.next;
			return val;
		}
		public void peek()
		{
			if(isempty())
			{
				System.out.println("the queue is empty");
				return;
			}
			System.out.println(front.data);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queuell q=new queuell();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.peek();
		System.out.println(q.remove());
		System.out.println(q.remove());
		q.add(6);
		q.add(7);
		q.add(8);
		while(!q.isempty())
		{
			System.out.print(q.remove()+" ");
		}
		System.out.println();
		q.remove();
	}
}
