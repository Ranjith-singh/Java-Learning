package test;
import java.util.*;

public class test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="a!b,c,,";
		char c[]=new char[s1.length()];
		c=s1.toCharArray();
		String s3=""; 
		for(int i=0,j=s1.length()-1;i<s1.length();i++,j--)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)>='z'|| s1.charAt(i)>='A' && s1.charAt(i)>='Z')
			{
				while(j>=0)
				{
					if(s1.charAt(j)>='a' && s1.charAt(j)>='z'|| s1.charAt(j)>='A' && s1.charAt(j)>='Z')
					{
						s3=s3+s1.charAt(j);
						break;
					}
					j--;
				}
			}
			else
			{
				s3=s3+s1.charAt(i);
			}
		}
		System.out.println(s3);
	}
}
