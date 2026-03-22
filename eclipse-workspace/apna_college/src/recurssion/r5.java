package recurssion;

//here the length of the stack is log(n)

public class r5 {

	public static int power(int a,int n)
	{
		if(n==1)
		{
			return a;
		}
		if(a==0)
		{
			return 0;
		}
		if(n==0)
		{
			return 1;
		}
		if(n%2==0)
		{
			int c=power(a,n/2)*power(a,n/2);
			return c;
		}
		else
		{
			int c=power(a,n/2)*power(a,n/2)*a;
			return c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int a=2;
		System.out.println(power(a,n));
	}

}
