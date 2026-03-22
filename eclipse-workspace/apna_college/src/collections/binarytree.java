package collections;

import java.util.*;

public class binarytree {
	int idx=-1;
	int idx1=-1;
	static Node root;
	static class Node
	{
		Node next,prev;
		int data;
		Node(int data)
		{
			this.data=data;
			next=prev=null;
		}
	}
	
	public Node add1(int[] nodes)
	{
		idx++;
		if(nodes[idx]==-1)
		{
			return null;
		}
		Node newnode=new Node(nodes[idx]);
		newnode.prev=add1(nodes);
		newnode.next=add1(nodes);
		return newnode;
	}
	public Node add2(int[] nodes1)
	{
		idx1++;
		if(nodes1[idx1]==-1)
		{
			return null;
		}
		Node newnode=new Node(nodes1[idx1]);
		newnode.prev=add2(nodes1);
		newnode.next=add2(nodes1);
		return newnode;
	}
	
	public void add(Node curr,int data,int a,int b)
	{
		Node newnode=new Node(data);
		if(root==null)
		{
			root=newnode;
			return;
		}
		if(curr==null)
		{
			return;
		}
		if(curr.data==a)
		{
			if(b==1)
			{
				curr.next=newnode;
				return;
			}
			curr.prev=newnode;
			return;
		}
		add(curr.prev,data,a,b);
		add(curr.next,data,a,b);
	}
	
	public void preorder(Node curr)
	{
		if(root==null)
		{
			System.out.println("the tree is empty");
			return;
		}
		if(curr==null)
		{
			return;
		}
		System.out.print(curr.data+" ");
		preorder(curr.prev);
		preorder(curr.next);
	}
	public void inorder(Node curr)
	{
		if(root==null)
		{
			System.out.println("the tree is empty");
			return;
		}
		if(curr==null)
		{
			return;
		}
		inorder(curr.prev);
		System.out.print(curr.data+" ");
		inorder(curr.next);
	}
	public void postorder(Node curr)
	{
		if(root==null)
		{
			System.out.println("the tree is empty");
			return;
		}
		if(curr==null)
		{
			return;
		}
		postorder(curr.prev);
		postorder(curr.next);
		System.out.print(curr.data+" ");
	}
	public static void printCorner(Node node)
    {
       Queue<Node> q1=new LinkedList<>();
       q1.add(node);
       q1.add(null);
       Node prev=node,curr=node;
       while(!q1.isEmpty())
       {
    	   curr=q1.remove();
    	   if(curr==null)
    	   {
    		   q1.add(null);
    		   prev=curr;
    		   continue;
    	   }
    	   if(curr.prev!=null && curr.next!=null)
    	   {
    		   q1.add(curr.prev);
    		   q1.add(curr.next);
    	   }
    	   else if(curr.next==null)
    	   {
    		   q1.add(curr.prev);
    	   }
    	   else if(curr.prev==null)
    	   {
    		   q1.add(curr.next);
    	   }   
    	   if(q1.peek()==null || prev==null)
    	   {
    		   System.out.print(curr.data+" ");
    	   }
    	   prev=curr;
       }
        // add your code here    
    }
	public void levelorder(Node root)
	{
		if(root==null)
		{
			System.out.println("the tree is empty");
			return;
		}
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty())
		{
			Node curr=q.remove();
			if(curr==null)
			{
				System.out.println();
				if(q.isEmpty())
				{
					break;
				}
				else
				{
					q.add(null);
				}
			}
			else
			{
				System.out.print(curr.data+" ");
				if(curr.prev!=null)
				{
					q.add(curr.prev);
				}
				if(curr.next!=null)
				{
					q.add(curr.next);
				}
			}
		}
	}
	public int count(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+count(root.prev)+count(root.next);
	}
	public int sum(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		return sum(root.prev)+sum(root.next)+root.data;
	}
	public int height(Node root,int a)
	{
		if(root==null)
		{
			return a;
		}
		a++;
		return Math.max(height(root.prev,a),height(root.next,a));
	}
	public int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		return Math.max(height(root.prev),height(root.next))+1;
	}
	public int diameter(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int diam1=diameter(root.prev);
		int diam2=diameter(root.next);
		int diam3=height(root.prev)+1+height(root.next);
		return Math.max(Math.max(diam1,diam2),diam3);
	}
	public static class treeinfo
	{
		int ht;
		int diam;
		treeinfo(int ht,int diam)
		{
			this.ht=ht;
			this.diam=diam;
		}
	}
	public treeinfo dia_h(Node root)
	{
		if(root==null)
		{
			return new treeinfo(0,0);
		}
		treeinfo left=dia_h(root.prev);
		treeinfo right=dia_h(root.next);
		int diam1=left.diam;
		int diam2=right.diam;
		int diam3=left.ht+1+right.ht;
		int mydia= Math.max(Math.max(diam1,diam2),diam3);
		int myht= Math.max(left.ht,right.ht)+1;
		return new treeinfo(myht,mydia);
	}
	public void kthnodes(int k)
	{
		if(root==null)
		{
			return;
		}
		int level=1;
		int sum=0;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		if(level==k)
		{
			sum=sum+root.data;
			System.out.println(sum);
			return;
		}
		while(!q.isEmpty())
		{
			Node curr=q.remove();
			if(curr==null)
			{
				level++;
				if(level==k)
				{
					q.add(null);
					while(level==k)
					{
						Node i=q.remove();
						if(i==null)
						{
							System.out.println(sum);
							return;
						}
						sum=sum+i.data;
					}
				}
				else
				{
					q.add(null);
				}
			}
			else
			{
				if(curr.prev!=null)
				{
					q.add(curr.prev);
				}
				if(curr.next!=null)
				{
					q.add(curr.next);
				}
			}
		}
	}
	public boolean isIdentical(Node root,Node subRoot)
	{
	       if(subRoot == null && root == null)
	       {
	           return true;
	       }
	       if(root == null || subRoot == null)
	       {
	           return false;
	       }
	       if(root.data == subRoot.data)
	       {
	           return isIdentical(root.prev, subRoot.prev) && 
	        		   isIdentical(root.next, subRoot.next);
	       }
	       return false;
	   }
	  
	   public boolean isSubtree(Node root, Node subRoot) 
	   {
	       if(subRoot == null)
	       {
	           return true;
	       }
	       if(root == null)
	       {
	           return false;
	       }
	       if(isIdentical(root, subRoot))
	       {
	           return true;
	       }
	       return isSubtree(root.prev, subRoot) || isSubtree(root.next, subRoot);
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarytree bt=new binarytree();
		int nodes[]= {1,2,4,-1,-1,-1,3,-1,-1};
		root=bt.add1(nodes);
		//int n1[]= {1,2,-1,-1,3,-1,-1};
		//Node root1=bt.add2(n1);
		//bt.add(head,1,1,1);
		//bt.add(head,2,1,0);
		//bt.add(head,3,1,1);
		//bt.add(head,4,2,0);
		//System.out.println(root.data);
		bt.preorder(root);
		System.out.println();
		//printCorner(root);
		bt.inorder(root);
		System.out.println();
		bt.postorder(root);
		System.out.println();
		bt.levelorder(root);
		//System.out.println(bt.count(root));
		//System.out.println(bt.sum(root));
		//System.out.println(bt.height(root,0));
		//System.out.println(bt.height(root));
		//System.out.println(bt.diameter(root));
		//System.out.println(bt.dia_h(root).diam);
		//System.out.println(bt.dia_h(root).ht);
		//System.out.println(bt.isSubtree(root,root1));
		//bt.kthnodes(3);
	}

}
