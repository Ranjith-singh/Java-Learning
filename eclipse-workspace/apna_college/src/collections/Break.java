package collections;

class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	
	public static void print(Node first)
	{
		Node n=first;
		while(n!=null)
		{
			System.out.print(n.data+"->");
			n=n.next;
		}
		System.out.println("Null");
	}
	
	public static void isloop(Node first)
	{
		Node turtle=first;
		Node rabbit=first;
		while(rabbit.next!=null && rabbit.next.next!=null)
		{
			turtle=turtle.next;
			rabbit=rabbit.next.next;
			if(turtle==rabbit)
			{
				Node t1=first;
				Node r1=first;
				while(r1!=turtle)
				{
					t1=t1.next;
					r1=r1.next.next;
				}
				int i=0;
				while(t1!=r1 && t1.next!=r1)
				{
					t1=t1.next;
					i++;
				}
				if(i%2==1)
				{
					r1.next.next=null;
				}
				else if(i==0)
				{
					r1.next=null;
				}
				else
				{
					Node temp=first; 
					while(temp.next!=r1)
					{
						temp=temp.next;
					}
					temp.next=null;
				}
			}
		}
	}
}

public class Break {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		Node.isloop(first);
		Node.print(first);
	}

}
