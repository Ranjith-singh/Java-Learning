package collections;

public class queue1 
{
		public static int a[];
		public static int size;
		public static int rear=-1,front=-1;
		queue1(int n)
		{
			a=new int[n];
			size=n;
		}
		public boolean isempty()
		{
			return front==-1 && rear==-1;
		}
		public void add(int n)
		{
			if((rear+1)%size==front)
			{
				System.out.println("the queue is full "+n+" can't be inserted");
				return;
			}
			if(front==-1)
			{
				front++;
			}
			rear=(rear+1)%size;
			a[rear]=n;
		}
		public int remove()
		{
			if(isempty())
			{
				System.out.println("the queue is empty");
				return -1;
			}
			int top=a[front];
			if(rear==front)
			{
				rear=front=-1;
				return top;
			}
			front=(front+1)%size;
			return top;
		}
		public void peek()
		{
			if(isempty())
			{
				System.out.println("the queue is empty");
				return;
			}
			System.out.println(a[front]);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue1 q=new queue1(5);
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
