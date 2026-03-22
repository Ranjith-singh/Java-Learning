package test;

public class test11 {

	public static void main(String args[])
	{
		String s="everyone";
		System.out.println(s);
		char a[]=new char[s.length()];
		for(int i=s.length()-1,j=0;i>=0;i--,j++)
		{
			a[j]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++)
		{
			System.out.print(a[i]);
		}
	}

}
