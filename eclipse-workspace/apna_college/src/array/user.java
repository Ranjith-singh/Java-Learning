package array;

//note: this package.class can be imported only within this file directory

class user2
{
	public void print2()
	{
		System.out.println("world");
	}
}

public class user {
	
	public int x=5;

	public static void main()
	{
		System.out.println("hello");
		user2 u2=new user2();
		u2.print2();
	}

}
