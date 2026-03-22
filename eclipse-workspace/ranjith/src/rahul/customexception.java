package rahul;

public class customexception extends Exception{
	customexception(String s)
	{
		super(s);
		System.out.println("String arg");
	}
	customexception(Exception e)
	{
		super(e);
		System.out.println("Exception arg");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customexception ce=new customexception("hello");
	}

}
