package ranjith;

//if the abstract method contains an arg in the interface then the implements class 
//should also contain arg

interface walk
{
	//default can be used to specify the constructor
	 default void walk()
	 {
		 System.out.println("i can walk");
		 privatevoid();
	 }
	 //private can be used public cannot be used here
	 private void privatevoid()
	 {
		 System.out.println("easily");
	 }
	 static void teststatic()
	 {
		 System.out.println("static method");
	 }
}
interface run 
{
	 void run();
}
// Main advantage of the interface is multiple implementations can be given to the single class
class animal implements run,walk
{
	/*public void walk()
	{
		System.out.println("walkable interface is getting executed");
	}*/
	public void run()
	{
		System.out.println("runable interface is getting executed");
	}
}
class human extends animal
{
	
}
public class multi_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// assigning the instance of subclass to the superclass
		walk h1=new human();
		run h2=new human();
		h1.walk();
		h2.run();
		walk.teststatic();
	}

}
