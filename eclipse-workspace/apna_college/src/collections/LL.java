package collections;

public class LL {
	Node head;
	int size=0;
	class Node
	{
		String data;
		Node next;
		Node(String data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public void addfirst(String data)
	{
		size++;
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	
	public void addlast(String data)
	{
		size++;
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		Node currnode=head;
		while(currnode.next!=null)
		{
			currnode=currnode.next;
		}
		currnode.next=newnode;
	}
	
	public void addatindex(int n,String data)
	{
		size++;
		Node newnode=new Node(data);
		if(n==0)
		{
			size--;
			addfirst(data);
			return;
		}
		Node currnode=head;
		for(int i=0;i<n-1;i++)
		{
			currnode=currnode.next;
		}
		Node curr1=currnode.next;
		currnode.next=newnode;
		newnode.next=curr1;	
	}
	
	public void delete(String data)
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		size--;
		if(head.data==data)
		{
			Node currnode=head;
			currnode=currnode.next;
			head.next=null;
			head=currnode;
			return;
		}
		Node currnode=head;
		while(currnode.data!=data)
		{
			currnode=currnode.next;
		}
		Node prev=head;
		while(prev.next!=currnode)
		{
			prev=prev.next;
		}
		prev.next=currnode.next;
		currnode.next=null;
	}
	
	public void deleteatindex(int n)
	{
		if(n>size)
		{
			System.out.println("the index provided is greater than the size");
			return;
		}
		if(n==size)
		{
			head=head.next;
			size--;
			return;
		}
		Node prev=head;
		for(int i=1;i<size-n;i++)
		{
			prev=prev.next;
		}
		prev.next=prev.next.next;
		size--;
	}
	
	public void print()
	{
		
		if(head==null)
		{
			System.out.println("the LL is empty");
		}
		Node currnode=head;
		while(currnode!=null)
		{
			System.out.print(currnode.data+"->");
			currnode=currnode.next;
		}
		System.out.println("NULL");
	}

	public void reverse_iterative()
	{
		if(head==null || head.next==null)
		{
			return;
		}
		Node prev=head;
		Node curr=prev.next;
		while(curr.next!=null)
			{
				Node next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
		curr.next=prev;
		head.next=null;
		head=curr;
	}
	
	public Node reverse_recursive(Node head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node newhead=reverse_recursive(head.next);
		head.next.next=head;
		head.next=null;
		return newhead;
	}
	
	public boolean palindrome()
	{
		if(head==null || head.next==null)
		{
			return true;
		}
		for(int i=1;i<=size/2;i++)
		{
			Node front=head,back=head;
			for(int j=1;j<i;j++)
			{
				front=front.next;
			}
			for(int j=1;j<=size-i;j++)
			{
				back=back.next;
			}
			if((front.data.compareTo(back.data))!=0)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean isloop()
	{
		Node turtle=head;
		Node rabbit=head;
		while(rabbit.next!=null && rabbit.next.next!=null)
		{
			turtle=turtle.next;
			rabbit=rabbit.next.next;
			if(turtle == rabbit)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list=new LL();
		list.addfirst("2");
		list.addfirst("1");
		list.addlast("4");
		list.addatindex(2,"3");
		list.print();
		list.delete("4");
		list.print();
		System.out.println(list.size);
		list.addlast("1");
		list.print();
		list.reverse_iterative();
		list.print();
		list.head=list.reverse_recursive(list.head);
		list.print();
		list.deleteatindex(3);
		list.print();
		list.addatindex(2,"3");
		list.print();
		if(list.palindrome())
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		System.out.println(list.isloop());
	}

}
