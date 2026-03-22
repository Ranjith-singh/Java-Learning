package concurency;

public class mathutils {
	// synchronized keyword is used to provide internsic lock

	  /*synchronized*/ void mutiple(int a)	//synchronized can be used on the method or a particular block of code
		// TODO Auto-generated method stub
		//int n=5;
		 {
		  synchronized(this) {
		for(int i=1;i<=5;i++)
		{
		System.out.println(i*a);
		
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
 }
}
