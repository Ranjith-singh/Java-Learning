package practice;

class a{
	int i=m1();
	a()
	{
		System.out.println("constructor");
	}
	int m1()
	{
		System.out.println("m1_method "+i);
		return 20;
	}
	{
		System.out.println("instance block");
	}
}
public class a7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a a1=new a();
		System.out.println(a1.i);
	}

}
