
//always use class variable in main method as in print or perform any operation
//ex: in system.out.println(object.instance variable)


package ranjith;

public class class_and_object {
	final static String constant="constant";
	int a;
	String b;
	
	public void print_message()
	{
		System.out.println("welcome");
	}
	class_and_object()
	{
		this(40);
	}
	class_and_object(int value)
	{
		this.a=value;
	}
	class_and_object(int value1,int value2)
	{
		this.a=value1+value2;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Classes are generic behaviour but objects have specific behaviour 
		//Variables of class are called as property
		//GENERAL RULES 
		//Class name and interface should start with uppercase or either camel casing
		//method name should be in lower case
		//CONSTANT NAME should be in uppercase
		
		/*local variables are declared within the method of the class
		 * Instance variable is at the class level outside method or constructor
		 * static/class has only one copy that is accessed by all the objects of a class
		 * constructor is used to initialize an object
		 */
		class_and_object co=new class_and_object();
		co.print_message();
		System.out.println(co.a);
		class_and_object co1=new class_and_object(40,30);
		System.out.println(co1.b);
		System.out.println(co1.a);
	}

}
