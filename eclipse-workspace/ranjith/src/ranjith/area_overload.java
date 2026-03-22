package ranjith;

//Static polymorphism or method overloading

public class area_overload {
	void area(int a,int b)
	{
		int area=a*b;
		System.out.println("area of the rectangle is "+area);
	}
	void area(int r)
	{
		float area=3.14f*r*r;
		System.out.println("area of the circle is "+area);
	}
	void area(String s)
	{
		System.out.println(s+" is a string,please enter a value");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area_overload a1=new area_overload();
		a1.area(5);
		a1.area(3, 4);
		a1.area("hi");
	}

}
