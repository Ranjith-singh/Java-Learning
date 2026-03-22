package ranjith;

public class metod {
	public int add(int a,int b)
	{	
		return a+b;
	}
	public int add(int a,int b,int c)
	{	
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		metod md=new metod();
		int c=md.add(a,b);
		int d=md.add(30,40,50);
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
	}
	// we can also return null value by specifying Null
}
