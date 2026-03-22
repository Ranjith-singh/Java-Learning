package array;

public class f1 {

	public static boolean isprime(int n)
	{
		if(n==2 || n==3)
		{
			return true;
		}
		if(n<=1 || n%2==0 || n%3==0)
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

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+" ");
			if(isprime(i))
			{
				System.out.print("prime ");
			}
			if(!isprime(i) && i%2!=0)
			{
				System.out.print("odd ");
			}
			if(i%2==0)
			{
				System.out.print("even ");
			}
			System.out.println();
		}
	}

}
