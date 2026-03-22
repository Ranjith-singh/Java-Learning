package collections;

import collections.trie.Node;

public class trie_uniqueSubstring {
	
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
	
	public static String longest="";
	
	public static void longest_word(Node root,StringBuilder sb)
	{
		for(int i=0;i<26;i++)
		{
			if(root.children[i]!=null && root.children[i].eow==true)
			{
				sb=sb.append((char)('a'+i));
				System.out.println(sb);
				if(sb.length()>longest.length())
				{
					longest=sb.toString();
				} 
				longest_word(root.children[i],sb);
				sb.deleteCharAt(sb.length()-1);
			}
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="apple";
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			insert(s.substring(i,n));
		}
		for(int i=1;i<=n;i++)
		{
			insert(s.substring(0,i));
		}
		String s1="banana";
		for(int i=1;i<=s1.length();i++)
		{
			insert(s1.substring(0,i));
		}
		System.out.println("The unique substrings of trie are "+count(root,0));
		insert("applae");
		insert("banana");
		longest_word(root,new StringBuilder(""));
		System.out.println(longest);
	}

}
