package test;

class member
{
	String name;
	int age;
	String phone_number;
	String address;
	int salary;
	void printsalary()
	{
		System.out.println("the salary is"+salary);
	}
}
class employee extends member
{
	String specialization;
}
class manager extends member
{
	String department;
}

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e=new employee();
		e.name="venkatesh";
		e.age=21;
		e.phone_number="9110641031";
		e.address="Vemana boys hostel,roopena agrahara";
		e.salary=100000;
		e.specialization="java devoloper";
		System.out.println(e.name+e.age+e.phone_number+e.address+e.salary+e.specialization);
		
		manager m=new manager();
		m.name="govardan";
		m.age=21;
		m.phone_number="9080684321";
		m.address="srinivasapura,kolar";
		m.salary=300000;
		m.department="software development";
		System.out.println(m.name+m.age+m.phone_number+m.address+m.salary+m.department);
	}

}
