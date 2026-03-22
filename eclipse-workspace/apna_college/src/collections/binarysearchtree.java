package collections;

import java.util.*;

public class binarysearchtree {
	static Node root;
	class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
		}
	}
	public Node insert(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		if(data<root.data)
		{
			root.left=insert(root.left,data);
		}
		else
		{
			root.right=insert(root.right,data);
		}
		return root;
	}
	public void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public void printinrange(Node root,int a,int b)
	{
		if(root==null)
		{
			return;
		}
		if(root.data>=a && root.data<=b)
		{
			printinrange(root.left,a,b);
			System.out.print(root.data+" ");
			printinrange(root.right,a,b);
		}
		else if(root.data>=a)
		{
			printinrange(root.left,a,b);
		}
		else
		{
			printinrange(root.right,a,b);
		}
	}
	public boolean search(Node root,int data)//O(h)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==data)
		{
			return true;
		}
		if(data<root.data)
		{
			return search(root.left,data);
		}
		if(data>root.data)
		{
			return search(root.right,data);
		}
		return false;
	}
	public Node delete(Node root,int data)//O(h)
	{
		if(this.root==null)
		{
			return null;
		}
		if(data<root.data)
		{
			root.left=delete(root.left,data);
		}
		if(data>root.data)
		{
			root.right=delete(root.right,data);
		}
		if(data==root.data)
		{
			if(root.left==null && root.right==null)
			{
				return null;
			}
			if(root.left==null)
			{
				return root.right;
			}
			if(root.right==null)
			{
				return root.left;
			}
			Node IS=inordersuccesor(root.right);
			root.data=IS.data;
			root.right=delete(root.right,IS.data);
		}
		return root;
	}
	public Node inordersuccesor(Node root)
	{
		while(root.left!=null)
		{
			root=root.left;
		}
		return root;
	}
	public void roottoleaf(Node root,ArrayList<Integer> path)
	{
		if(this.root==null)
		{
			return;
		}
		if(root==null)
		{
			return;
		}
		path.add(root.data);
		if(root.left==null && root.right==null)
		{
			System.out.println(path);
			path.remove(path.size()-1);
			return;
		}
		roottoleaf(root.left,path);
		roottoleaf(root.right,path);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarysearchtree bst=new binarysearchtree();
		int nodes[]= {5,3,4,2,6,7};
		for(int i=0;i<nodes.length;i++)
		{
		root=bst.insert(root,nodes[i]);
		}
		bst.inorder(root);
		System.out.println("\n"+bst.search(root,1));
		//root=bst.delete(root,3);
		bst.inorder(root);
		System.out.println();
		bst.printinrange(root,4,6);
		System.out.println();
		ArrayList<Integer> path=new ArrayList<>();
		bst.roottoleaf(root,path);
	}

}
