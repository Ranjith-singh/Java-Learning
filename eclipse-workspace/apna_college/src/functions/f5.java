package functions;

import java.util.*;

public class f5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the 2 no's");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=1;
		while(true)
		{
			if(a%2==0 && b%2==0)
			{
				gcd=gcd*2;
				a=a/2;
				b=b/2;
				continue;
			}
			else if(a%3==0 && b%3==0)
			{
				gcd=gcd*3;
				a=a/3;
				b=b/3;
				continue;
			}
			else if(a%5==0 && b%5==0)
			{
				gcd=gcd*5;
				a=a/5;
				b=b/5;
				continue;
			}
			else if(a%7==0 && b%7==0)
			{
				gcd=gcd*7;
				a=a/7;
				b=b/7;
				continue;
			}
			else
			{
				break;
			}
		}
		sc.close();
		System.out.println("the gcd is "+gcd);
	}

}
