package functions;

import java.util.*;

public class f4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the power to be raised");
		int x=sc.nextInt();
		int exp=1;
		for(int i=1;i<=x;i++)
		{
			exp*=a;
		}
		System.out.println(a+" raised t0 the power "+x+" is "+exp);
		sc.close();
	}

}
