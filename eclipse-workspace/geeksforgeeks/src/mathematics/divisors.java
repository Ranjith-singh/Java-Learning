package mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class divisors
{
	public static void divisor(ArrayList<Integer> a,int n)
	{
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
			{
				a.add(i);
				if(n/i!=i)
				{
					a.add(n/i);
				}
			}
		}
		Collections.sort(a);
		System.out.println(a);
	}

	public static void divisor1(int n)
	{
		int i;
		for(i=1;i*i<n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
		if(i==n/i)
		{
			System.out.print(i+" ");
		}
		i--;
		for(;i>=1;i--)
		{
			if(n%i==0)
			{
				System.out.print(n/i+" ");
			}
		}
		System.out.println();
	}

	public static void primeNumbers(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(Lcm.isprime(i))
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void primeno(int n)
	{
		Boolean b[]=new Boolean[n+1];
		Arrays.fill(b,true);
		for(int i=2;i<=n;i++)
		{
			if(b[i])
			{
				System.out.print(i+" ");
				for(int j=i*i;j<=n;j=j+i)
				{
					b[j]=false;
				}
			}
		}
		System.out.println();
	}

	public static void power(int a,int n)
	{
		int res=1;
		for(int i=1;i<=n;i++)
		{
			res=res*a;
		}
		System.out.println(res);
	}

	public static int power1(int a,int n)
	{
		if(n==0)
		{
			return 1;
		}
		int res=power1(a,n/2);
		res=res*res;
		if(n%2==0)
		{
			return res;
		}
		else
		{
			return res*a;
		}
	}

	public static void power2(int a,int n)
	{
		int res=1;
		while(n>0)
		{
			if((n&1)==1)
			{
				res=res*a;
			}
			a=a*a;
			n=n>>1;
		}
		System.out.println(res);
	}

    public static int divisor(int a)
    {
        int ans=0,i;
        for(i=1;i*i<a;i++)
        {
            if(a%i==0)
            {
               ans=ans+2;
            }
        }
        if(a/i==i)
        {
            ans++;
        }
        return ans;
    }

    public static int exactly3Divisors(int N)
    {
        //Your code here
        int n=0;
        int b[]=new int[N+1];
        Arrays.fill(b,1);
        if(N<1)
        {
            return 0;
        }
        for(int i=2;i<=N;i++)
        {
            if(b[i]==1)
            {
                for(int j=i*i;j<=N;j=j+i)
                {
                	if(j>N)
                	{
                		break;
                	}
                	System.out.println(j);
                    b[j]=0;
                }
            }
            else
            {
                if(divisor(i)==3)
                {
                n++;
                }
            }
        }
        return n;
    }

    public static int exactly3Divisor(int N)
    {
        //Your code here
    	int ans=0;
        for(int i=2;i*i<=N;i++)
        {
        	if(Lcm.isprime1(i))
        	{
        		ans++;
        	}
        }
        return ans;
    }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		divisor(new ArrayList<Integer>(),99);
		divisor(new ArrayList<Integer>(),101);
		divisor(new ArrayList<Integer>(),182);
		divisor(new ArrayList<Integer>(),176);
		System.out.println(divisor(12));
		divisor1(10);
		primeNumbers(10);
		primeno(49);
		power(2,3);
		System.out.println(power1(3,5));
		power2(3,10);
	}
}
