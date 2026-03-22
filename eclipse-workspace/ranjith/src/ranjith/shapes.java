package ranjith;

abstract class shape1 {
	abstract float area();//providing signature without implementation
	//abstract int a=100; abstract cannot be used for a variable or object
	public void display(float area)
	{
		System.out.println("area is "+area);
	}
}
class circle1 extends shape1
{
	float area()
	{
		return 1.2f;
	}
}
public class shapes
{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape1 c=new circle1();
		float area=c.area();
		c.display(area);
	}

}
