package concurency;

public class thread1 extends Thread{
	mathutils mu;
	public thread1(mathutils mu)
	{
		this.mu=mu;
	}
public void run()
{
	try
	{
		mu.mutiple(2);
		//System.out.println("Thread1 is running");	
	}
	catch(Exception e)
	{
		System.out.println("Exception raised"+e); 
	}
	finally
	{
		
	}
}
}
