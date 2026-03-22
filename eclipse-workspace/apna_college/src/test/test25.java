package test;

public class test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		test26 t26=new test26();
		t26.world(args);
	}

}
class test26
{
	test26()
	{
		System.out.println("world 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("world 2");
	}
	public static void world(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("world 3");
	}
}
