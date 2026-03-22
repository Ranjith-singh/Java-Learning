package collections;

import java.util.*;

public class hash_map 
{
	static class Hashmap<k,v>
	{
		private class Node
		{
			k key;
			v value;
			public Node(k key,v value)
			{
				this.key=key;
				this.value=value;
			}
		}
		private int N;
		private int n;
		private LinkedList<Node> buckets[];
		public Hashmap()
		{
			this.N=4;
			this.buckets=new LinkedList[4];
			for(int i=0;i<N;i++)
			{
				this.buckets[i]=new LinkedList<>();
			}
		}
		private void rehash()
		{
			LinkedList<Node> oldbuck[]=buckets;
			buckets=new LinkedList[N*2];
			for(int i=0;i<N*2;i++)
			{
				buckets[i]=new LinkedList<>();
			}
			for(int i=0;i<oldbuck.length;i++)//length or N lim
			{
				LinkedList<Node> ll=oldbuck[i];
				for(int j=0;j<ll.size();i++)
				{
					Node node=ll.get(j);
					put(node.key,node.value);
				}
			}
		}
		private int bucketind(k key)
		{
			int bi=key.hashCode();
			return Math.abs(bi)%4;
		}
		private int dataind(k key,int bi)
		{
			LinkedList<Node> ll=buckets[bi];
			for(int i=0;i<ll.size();i++)
			{
				if(ll.get(i).key==key)
				{
					return i;
				}
			}
			return -1;
		}
		public void put(k key,v value)
		{
			int bi=bucketind(key);
			int di=dataind(key,bi);
			if(di==-1)
			{
				n++;
				buckets[bi].add(new Node(key,value));
			}
			else
			{
				Node node=buckets[bi].get(di);
				node.value=value;
			}
			double lambda =(double)n/N;
			if(lambda>2.0)
			{
				rehash();
			}
		}
		public v get(k key)
		{
			int bi=bucketind(key);
			int di=dataind(key,bi);
			if(di==-1)
			{
				return null;
			}
			else
			{
				Node node=buckets[bi].get(di);
				return node.value;
			}
		}
		public boolean contains(k key)
		{
			int bi=bucketind(key);
			int di=dataind(key,bi);
			if(di==-1)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		public v remove(k key)
		{
			int bi=bucketind(key);
			int di=dataind(key,bi);
			if(di==-1)
			{
				return null;
			}
			else
			{
				Node node=buckets[bi].remove(di);
				n--;
				return node.value;
			}
		}
		public boolean isEmpty()
		{
			return n==0;
			/*for(int i=0;i<buckets.length;i++)
			{
				if(!buckets[i].isEmpty())
				{
					return false;
				}
			}
			return true;*/
		}
		public ArrayList<k> keys()
		{
			ArrayList<k> keys=new ArrayList<>();
			for(int i=0;i<buckets.length;i++)
			{
				LinkedList<Node> ll=buckets[i];
				for(int j=0;j<ll.size();j++)
				{
					Node n=ll.get(j);
					keys.add(n.key);
				}
			}
			return keys;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap<String,Integer> map=new Hashmap<>();
		map.put("india",150);
		map.put("china",200);
		map.put("india",180);
		System.out.println(map.get("india"));
		System.out.println(map.contains("india"));
		//System.out.println(map.remove("china"));
		//System.out.println(map.remove("india"));
		System.out.println(map.isEmpty());
		System.out.println(map.keys());
	}

}
