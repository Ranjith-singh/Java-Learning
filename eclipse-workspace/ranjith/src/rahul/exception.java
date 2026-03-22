package rahul;

/* checked exception,unchecked exception error
 * */

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int denominator=1;
		int[] a=new int[3];
		//int[] array= {1,2,3};
		try
		{
			//int a=0,b=0;
			System.out.println(2/0);
			try
			{
			System.out.println(a[2]);
			}
			catch(ArrayIndexOutOfBoundsException arr)
			{
				System.out.println("array exception");
			}
			catch(NullPointerException npe)
			{
				System.out.println("null pointer excetption");
			}
			System.out.println("this will not be exicuted if the inner catch does not handle the inner try");
		}
		catch(ArithmeticException e)
		{
			System.out.println("the number cannot be"+e.getMessage());
		}
		catch(NullPointerException npe)
		{
			System.out.println("null pointer excetption");
		}
		catch(ArrayIndexOutOfBoundsException arr)
		{
			System.out.println("array exception");
		}
		catch(RuntimeException re)
		{
			System.out.println("Runtime exception");
		}
		catch(Exception EX)
		{
			System.out.println("general exception");
		}
		/*
		 * finally { System.out.println("division complete"); }
		 */
		System.out.println("hello");
	}

}
