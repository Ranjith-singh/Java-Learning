package ranjith;

public class array {
	public static void main(String args[])
	{
		int[] a1=new int[5];
		int[] a= {1,2,3,4};
		char[] c= {'A','B','c'};
		System.out.println(c);
		char[] ch=new char[5];
		System.out.println(ch);
		String str=new String("hello");
		String str1="edureka";
		System.out.println(str+" "+str1);
		for(int i:a)
			System.out.println(i);
		int[][] b= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(b.length);
		for(int[] i:b)
		{
			for(int j:i)
			System.out.print(j);
		System.out.println("");
		}
	}
	}
