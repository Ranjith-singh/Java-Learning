package mathematics;

import java.util.ArrayDeque;

public class palindrome {

	public static boolean palindrome1(ArrayDeque<Integer> dq)
	{
		int a=dq.size()/2;
		for(int i=0;i<a;i++)
		{
			if(dq.removeFirst()!=dq.removeLast())
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12321;
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		while(a!=0)
		{
		dq.add(a%10);
		a=a/10;
		}
		System.out.println(palindrome1(dq));
		a=12331;
		int b=0,c=a;
		while(c!=0)
		{
			b=b*10+c%10;
			c=c/10;
		}
		System.out.println(b);
		if(b==a)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
