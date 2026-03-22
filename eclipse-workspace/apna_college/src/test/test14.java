package test;

class shape
{
	void shapes()
	{
		System.out.println("this is shape");
	}
}
class rectangle extends shape
{
	void rectangles()
	{
		System.out.println("this is rectangular shape");
	}
}
class circle extends shape
{
	void circles()
	{
		System.out.println("this is circular shape");
	}
}
class square extends rectangle
{
	void squares()
	{
		System.out.println("square is a rectangle");
	}
}

public class test14{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square sq=new square();
		sq.shapes();
		sq.rectangles();
	}

}
