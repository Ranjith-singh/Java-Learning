package collections;

import java.util.*;

public class trie 
{
	static class Node
	{
		Node children[];
		boolean eow;
		Node()
		{
			children=new Node[26];
			for(Node i:children)
			{
				i=null;
			}
			eow=false;
		}
	}
	static Node root=new Node();
	
	public static void insert(String word)
	{
		Node curr=root;
		for(int i=0;i<word.length();i++)
		{
			int idx=word.charAt(i)-'a';
			if(curr.children[idx]==null)
			{
				curr.children[idx]=new Node();	
			}
			curr=curr.children[idx];
		}
		curr.eow=true;
	}
	public static boolean search(String word)
	{
		Node curr=root;
		for(int i=0;i<word.length();i++)
		{
			int idx=word.charAt(i)-'a';
			if(curr.children[idx]==null)
			{
				return false;
			}
			curr=curr.children[idx];
		}
		return curr.eow;
	}
	public static boolean wordbreak(String word)
	{
		if(word=="")
		{
			return true;
		}
		for(int i=1;i<=word.length();i++)
		{
			String s=word.substring(0,i);
			if(search(s))
			{
				if(wordbreak(word.substring(i)))
				{
					return true;
				}
			}
		}
		return false;
	}
	public static boolean startswith(String word)
	{
		Node curr=root;
		for(int i=0;i<word.length();i++)
		{
			int idx=word.charAt(i)-'a';
			if(curr.children[idx]==null)
			{
				return false;
			}
			curr=curr.children[idx];
		}
		return true;
	}
	public static int count(Node root,int count)
	{
		count++;
		for(int i=0;i<26;i++)
		{
			if(root.children[i]!=null)
			{
				count=count(root.children[i],count);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[]= {"the","their","there","i","like","samsung"};
		for(String word:words)
		{
			insert(word);
		}
		System.out.println(search("the"));
		System.out.println(search("their"));
		System.out.println(search("ther"));
		System.out.println(search("an"));
		System.out.println();
		System.out.println(wordbreak("ilikesamsung"));
		System.out.println();
		System.out.println(startswith("sun"));
		System.out.println();
	}
}
