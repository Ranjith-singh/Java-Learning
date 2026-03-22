package recurssion;

public class r3 {
	
	public static int power(int a,int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(a==0)
		{
			return 0;
		}
		if(n==1)
		{
			return a;
		}
		int c=a*power(a,n-1);
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int a=2;
		System.out.println(power(a,n));
	}

}
