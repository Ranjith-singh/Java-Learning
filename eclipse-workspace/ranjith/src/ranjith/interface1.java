package ranjith;

//by default all the methods inside the interface are abstract
//need not to mention explicitly

interface shape
{
	 float distance=23;
	 float area();
	 public static void func()
	 {
		 System.out.println("hello bro");
		 System.out.println(distance);
	 }
}

class circle implements shape
{
	 public float area()
	{
		return 1.2f;
	}
}

public class interface1 implements shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		System.out.println(c.distance);
		shape.func();
		//Since it is interface(abstract class) we should make reference to the static method using the
		//name of the interface
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
