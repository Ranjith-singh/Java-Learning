package rahul;

public class exception1 {

	public static void main(String[] args) throws Exception,NullPointerException //u can throw any type exception u want
	{
		// TODO Auto-generated method stub
		try
		{
			int a=10,b=0,c;
			//c=a/b;
			if(b==0)
			{
				//throw new customexception("divide by zero exception");
				throw new NullPointerException("Null pointer exception");
				//throw new RuntimeException("Runtime exception");
			}
			System.out.println("in try");
			System.out.println(a/b);
		}
		
		catch(Exception e)
		{
			 System.out.println("Exception is "+e);
		}
		finally
		{
		System.out.println("after try");
		}
		System.out.println("general");
	}
}
