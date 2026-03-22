package linked_list;
	
	// head of list

	/* Linked list Node. This inner class is made static so
	that main() can access it */
class Node {

	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	} // Constructor

	/* This function prints contents of linked list starting
	* from head */
}
	// Driver's code
public class simple_ll
{
	public static void printList(Node first)
	{
		while (first.next != null) 
		{
			System.out.print(first.data + " ");
			first = first.next;
		}
		System.out.print(first.data + " ");
		System.out.println();
	}
	static void add(Node m,Node n,Node x)
	{
		m.next=x;
		x.next=n;
	}
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		//LinkedList llist = new LinkedList();

		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth=new Node(4);
		
		first.next = second; // Link first node with
								// the second node
		second.next= third; // Link second node with the third node
		// Function call
		//simple_ll sll=new simple_ll();
		printList(first);
		add(first,second,fourth);
		printList(first);
	}
}

