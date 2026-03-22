package array;

import java.util.Scanner;

public class f2 {

	public static int add(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		return add(a^b,(a&b)<<1);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(add(a,b));
	}

}
