package ranjith;

/* the variables of the super class can be accessed only in the method of the subclass
 * method not outside it
 * if we try to access it outside the class then we must initialize it the the variable 
 * gets overrided
 */
class vehicle 
{
	int wheels=4;
	void run1()
	{
	System.out.println("it has properties of vehicle "+wheels);
	}
}
class bike extends vehicle
{
	void run2()
	{
	wheels-=2;
	System.out.println("it has properties of bike "+wheels);
	}
}
class cycle extends bike
{
	void run3()
	{
	System.out.println("it has properties of cycle");
	}
}

public class multilevel {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		cycle cy=new cycle();
		vehicle v=new vehicle();
		v.run1();
		cy.run1();
		cy.run2();
		vehicle v1=new vehicle();
		cy.run1();
		v.run1();
		v1.run1();
		cy.run3();
	}	// The object created in that class reflects the properties of itself and its parents rather
		// its child  

}
