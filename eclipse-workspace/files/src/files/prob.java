package files;

import java.util.Scanner;

public class prob {
	
public static void main(String args[])
{
	System.out.println("enter the String");
	Scanner sc=new Scanner(System.in);
	String s=new String();
	s=sc.nextLine();
	int[] arr=new int[100];
	for(int i=0;i<s.length();i++)
	{
		arr[i]=0;
	}
	char[] c=new char[s.length()];
	for(int i=0;i<s.length();i++)
	{
		c[i]=s.charAt(i);
		for(int j=0;j<s.length();j++)
		{
			if(c[i]==c[j])
			{
				arr[i]=arr[i]+1;
			}
		}
	}
	int count=0;
	int l=0;
	for(int k=0;k<arr.length;k++)
	{
		if(arr[k]>count)
		{
			count=arr[k];
			l=k;
		}
	}
	System.out.println("the maximum repeated charecter is "+s.charAt(l)+" which is repeated "+arr[l]+" no of times");
}
}
