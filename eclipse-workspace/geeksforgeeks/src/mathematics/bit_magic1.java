package mathematics;

public class bit_magic1 {

	public static int clear(int a,int n)
	{
		int b=(1<<(n-1));
		b=~b;
		return a&b;
	}

	public static int toggle(int a,int n)
	{
		int b=(1<<(n-1));
		return a^b;
	}

	public static boolean set(int a,int n)
	{
		int b=(1<<(n-1));
		return ((a&b)!=0);
	}

	public static int log2(int n)
	{
		int res=0;
		while(n!=1)
		{
			res++;
			n=n>>1;
		}
		return res;
	}

	public static int flipno(int a)
	{
		int b=(1<<(log2(a)+1))-1;
		return a^b;
	}

	public static void swap(int a,int b)
	{
		a=a^b;
		b=b^a;
		a=a^b;
		System.out.println(a+" "+b);
	}
	public static int xor1ton(int n)
	{
		if(n%4==0)
		{
			return n;
		}
		if(n%4==1)
		{
			return 1;
		}
		if(n%4==2)
		{
			return n+1;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=40,n=6;
		//System.out.println(~a+" "+(-a));
		System.out.println(clear(a,n)+" "+clear(a,1));
		System.out.println(toggle(a,n)+" "+toggle(a,1));
		System.out.println(set(a,n)+" "+set(a,1));
		//-1 is the maximum possible value of right shift in case of negative no
		System.out.println(log2(32)+" "+log2(8));
		System.out.println(flipno(8));
		swap(a,n);
		System.out.println(xor1ton(5)+" "+xor1ton(6)+" "+xor1ton(7)+" "+xor1ton(8));
		System.out.println(12&-12);
	}

}
