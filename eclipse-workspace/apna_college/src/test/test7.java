package test;

public class test7 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*
		 * String a[]= {"1","2 2","3 3 3","4 4 4 4","5 5 5 5 5"}; int n = 5; int t=12;
		 * int s[] = {}; for(int i=0;i<n;i++) { System.out.print(i,i,i); }
		 */
		for(int a=1;a<=5;a++)
		{
			if(a==1)
			{
				System.out.println(a);
			}
			else if(a==2)
			{
				System.out.println(a+""+a);
			}
			else if(a==3)
			{
				System.out.println(a+""+a+""+a);
			}
			else if(a==4)
			{
				System.out.println(a+""+a+""+a+""+a);
			}
			else if(a==5)
			{
				System.out.println(a+""+a+""+a+""+a+""+a);
			}
		}
	}
}
