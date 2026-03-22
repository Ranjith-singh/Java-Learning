package mathematics;

import java.util.ArrayList;

public class Lcm {

	public static int lcm(int a,int b)
	{
		int c=1;
		int i=2;
		while(a!=1 && b!=1)
		{
			if(i>a || i>b)
			{
				break;
			}
			if(a%i==0 && b%i==0)
			{
				c=c*i;
				a=a/i;
				b=b/i;
				continue;
			}
			i++;
		}
		c=c*a*b;
		return c;
	}

	public static int lcm1(int a,int b)
	{
		return (a*b)/factorial.gcd2(a,b);
	}

	public static boolean isprime(int n)
	{
		if(n==1)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static boolean isprime1(int n)
	{
		if(n==2 || n==3)
		{
			return true;
		}
		if(n==1 || n%2==0 || n%3==0)
		{
			return false;
		}
		for(int i=5;i*i<=n;i=i+6)
		{
			if(n%i==0 || n%(i+2)==0)
			{
				return false;
			}
		}
		return true;
	}

	public static ArrayList<Integer> prime(ArrayList<Integer> a1,int n)
	{
		if(isprime1(n))
		{
			a1.add(n);
			return a1;
		}
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				if(isprime1(i))
				{
					a1.add(i);
					a1.addAll(prime(new ArrayList<Integer>(),n/i));
					break;
				}
			}
		}
		return a1;
	}

	public static void primefactors(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			int x=i;
			if(isprime1(i))
			{
				while(n%x==0)
				{
					System.out.print(i+" ");
					x=x*i;
				}
			}
		}
		System.out.println();
	}

	public static void primefactors1(int n)
	{
		if(n<=1)
		{
			return;
		}
		for(int i=2;i*i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
		if(n>1)
		{
			System.out.print(n);
		}
		System.out.println();
	}

	public static void primefactors2(int n)
	{
		if(n<=1)
		{
			return;
		}
		while(n%2==0)
		{
			System.out.print(2+" ");
			n=n/2;
		}
		while(n%3==0)
		{
			System.out.print(3+" ");
			n=n/3;
		}
		for(int i=5;i*i<=n;i=i+6)
		{
			if(isprime(i))
			{
				while(n%i==0)
				{
					System.out.print(i+" ");
					n=n/i;
				}
				while(n%(i+2)==0)
				{
					System.out.print((i+2)+" ");
					n=n/(i+2);
				}
			}
		}
		if(n>3)
		{
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcm(2,2));
		System.out.println(lcm(9,12));
		System.out.println(lcm(3,9));
		System.out.println(lcm1(4,3));
		System.out.println(isprime(101));
		System.out.println(isprime1(101));
		int a=Integer.numberOfTrailingZeros(496);
		int b=Integer.bitCount(496);
		if(b==a+1)
		{
			System.out.println(true);
		}
		System.out.println(prime(new ArrayList<Integer>(),450));
		primefactors(450);
		primefactors1(450);
		primefactors2(450);
	}

}
