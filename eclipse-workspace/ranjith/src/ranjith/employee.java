package ranjith;

// when printed in the constructor then id and this.id are different
// but when printed in the method then they are same
public class employee {
	public static String company="IBM";
	int id;
	int salary;
	employee(int id,int salary)
	{
		
		this.id=id+1;
		this.salary=salary;
		System.out.println(company+" "+id+" "+salary);
		System.out.println(company+" "+this.id+" "+salary);
		System.out.println();
	}
	void display()
	{
		System.out.println(company+" "+id+" "+salary);
		System.out.println(company+" "+this.id+" "+salary);
		System.out.println();
	}
	void add(employee e1)
	{
		System.out.println("printing the address of the object e1 "+e1);
		System.out.println();
	}
	public static void print()
	{
		System.out.println("welcome");
	}
	public Integer numbers(int arg1,int arg2)
	{
		add(this);
		int result=arg1+arg2;
		return result;
	}

	public static void main(String[] args) {
		employee e1=new employee(209,50000);
		//System.out.println(e1.numbers(10,20));
		e1.display();
		employee e2=new employee(210,60000);
		e1.add(e1);
		e2.display();
		employee.print();
		print();
		// TODO Auto-generated method stub

	}

}
