package annotations;

import java.lang.reflect.Method;

public class myclass {
	@markerannotation(value=10)
	//markerannotation is a target is method so it can be placed only on methods not on class
	
	public void sayhello()
	{
		System.out.println("my custom annotation");
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		myclass mc=new myclass();
		Method mt=mc.getClass().getMethod("sayhello");//getclass returns myclass type and getmethod returns the method type with the name sayhello
		
		markerannotation ma=mt.getAnnotation(markerannotation.class);
		System.out.println("value is :"+ma.value());
	}

}
