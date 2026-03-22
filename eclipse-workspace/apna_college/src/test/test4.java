package test;

public class test4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<=6;j++)
			{
				if(j<i)
				{
					System.out.print(j);
				}
				else
				{
					if(j==i)
					{
						System.out.print(" ");
					}
					System.out.print("&");
				}
			}
			System.out.println();
		}
	}

}
