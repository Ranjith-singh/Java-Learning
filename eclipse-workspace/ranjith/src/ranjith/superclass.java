package ranjith;

// when creating the object of the subclass the constructor of the super class
//is called first then the constructor of the subclass

/* if final is used for the class then we can't create the subclass of that class
 * if we make the method final then we can't override it in the subclass
 */
//final class vehicle1

 class vehicle1
{
	final String wheels="vehicle moves on the wheels";
	
	// constructor cannot be made a final
	vehicle1()
	{
		System.out.println("we are in super class ");
	}
	void move() 
	{
		//if final in the method then can't override it
	}
}
class truck extends vehicle1
{
	String wheels="4 wheels";
	public truck() {
		//wheels="2 wheels";
		System.out.println(wheels);
		System.out.println(super.wheels);
		// TODO Auto-generated constructor stub
	}
	void move()
	{
		
	}
}

public class superclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		truck t=new truck();
	}

}
