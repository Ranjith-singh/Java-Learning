package concurency;

public class Thread2 implements Runnable{
	mathutils mu;
	public Thread2(mathutils mu)
	{
		this.mu=mu;
	}
	public void run()
	{
		try
		{
			mu.mutiple(3);
			//System.out.println("Thread2 is running");	
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught"); 
		}
		finally
		{
			
		}
	}
}
