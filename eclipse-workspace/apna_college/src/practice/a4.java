package practice;

public class a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,n,sum,q,r;
		a=123;
		n=0;
		sum=0;
		q=a;
		while(q % 10 !=0)
		{
			n=n+1;
			q=q/10;
		}
		System.out.println(n);
	}

}
