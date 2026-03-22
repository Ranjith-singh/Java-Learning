package ranjith;

class manager
{
	int salary=10000;
	static int bonus=1000; 
	public void intro()
	{
	System.out.println("i am a manager");	
	}
}
class benchmark extends manager
{
	String bench="800000 units";
	//override
	//int salary=30000;
}
class employee2 extends manager
{
	int id=210;
	int empsal=15000;
	public void intro()
	{
	System.out.println("i am an employee");	
	}
}
public class inheritence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager mg=new manager();
		System.out.println(mg.salary);
		employee2 e=new employee2();
		e.salary+=10000;
		e.bonus+=500;
		manager mg1=new manager();
		System.out.println(e.salary);
		System.out.println(e.salary+" "+mg.salary+" "+" "+mg1.salary+" "+e.id+" "+e.empsal);
		manager m1=e;
		e.intro();
		m1.intro();
		benchmark b=new benchmark();
		System.out.println(b.bench);
		System.out.println(b.salary);
	}
// for each object a separate set of variables and methods are created.The variable modified in one
// object is not reflected in the other object
// if u want the variable to be modified in all objects make it as static
}
