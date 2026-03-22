package ranjith;

public class nested_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean t=true;
		first:
		{
			second:
			{
				third:
				{
					System.out.println("third");
				}
				System.out.println("second");
			}
			System.out.println("first");
		}

	}

}
