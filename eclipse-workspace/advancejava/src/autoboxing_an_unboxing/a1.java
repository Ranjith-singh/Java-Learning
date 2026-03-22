package autoboxing_an_unboxing;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		//Autobox
		Integer obj1=Integer.valueOf(a);
		System.out.println("the value of obj1 is "+obj1);
		
		//Autounbox
		int i1=obj1;
		System.out.println("the value of i1 is "+i1 );
	}

}
