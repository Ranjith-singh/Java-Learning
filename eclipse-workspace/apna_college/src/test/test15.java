package test;

class parent
{
	void parents()
	{
		System.out.println("this is parent class");
	}
}
class child extends parent
{
	void childs()
	{
		System.out.println("this is child class");
	}
}

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new parent();
		child c=new child();
		p.parents();
		c.childs();
		c.parents();
	}

}
