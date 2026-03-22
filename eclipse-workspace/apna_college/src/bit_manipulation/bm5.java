package bit_manipulation;

import java.util.*;

public class bm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(2^3);
		System.out.println("Enter the operation\n1 if binary to decimal 2 if decimal to binary");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter the number");
		int b=sc.nextInt();
		String e=String.valueOf(b);
		sc.close();
		int c=0,f=e.length()-1;
		if(a==1)
		{
			for(int i=0;i<e.length();i++)
			{
				int d=1;
				if(e.charAt(f)=='1')
				{
					for(int j=0;j<i;j++)
					{
						d=d*2;
					}
					c=c+d;
				}
				f--;
			}
			System.out.println(c);
		}
		else
		{
			System.out.println(Integer.toBinaryString(b));
		}
		}

}
