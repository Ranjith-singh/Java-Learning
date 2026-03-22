package pattern;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9,m=9;
		for(int i=1,k=n;i<=n;i++,k--)
		{
			for(int j=1;j<=m;j++)
			{
				if(i<k)
				{
					if(j<=i || j>=k)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				else
				{
					if(j<=k||j>=i)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}

}
