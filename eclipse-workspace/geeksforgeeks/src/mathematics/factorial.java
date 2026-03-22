package mathematics;

public class factorial {

	public static void trailling_zeros(int a)
	{
		int c=0;
		while(a%10==0)
		{
			c++;
			a=a/10;
		}
		System.out.println(c);
	}
	public static void trailling_zeros1(int n)
	{
		int c=0;
		for(int i=5;i<=n;i=i*5)
		{
			c=c+n/i;
		}
		System.out.println(c);
	}
	public static int gcd(int a,int b)
	{
		int c=Math.max(a,b);
		int d=0;
		for(int i=1;i<=c;i++)
		{
			if(a%i==0 && b%i==0)
			{
				if(d<i)
				{
					d=i;
				}
			}
		}
		return d;
	}
	public static int gcd1(int a,int b)
	{
		while(a!=b)
		{
			if(a<b)
			{
				b=b-a;
			}
			else
			{
				a=a-b;
			}
		}
		return a;
	}
	public static int gcd2(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		return gcd2(b,a%b);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=1000,a=1;
		for(int i=2;i<=n;i++)
		{
			a=a*i;
		}
		System.out.println(a);
		//trailling_zeros(a);
		trailling_zeros1(n);
		System.out.println(gcd(15,45));
		//basic nersion of euclidian algorithm
		System.out.println(gcd1(15,25));
		double start_time=System.nanoTime();
		//advanced euclidian method
		System.out.println(gcd2(15,25));
		double end_time=System.nanoTime();
		double time_ellasped=end_time-start_time;
		System.out.println(time_ellasped/1000000);
	}

}
