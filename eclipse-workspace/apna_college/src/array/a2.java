package array;

public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,-1,-2};
		int n=a.length;
		int x=Integer.MIN_VALUE;
		int y=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				if(a[i]>x)
				{
					x=a[i];
				}
			}
			if(a[i]>0)
			{
				if(a[i]<y)
				{
					y=a[i];
				}
			}
		}
		if(x==Integer.MIN_VALUE)
		{
			System.out.print(y+" ");
		}
		else if(-x<y)
		{
			System.out.print(x+" ");
		}
		else
		{
			System.out.print(y+" ");
		}
		System.out.println("is the element closest to 0");
	}

}
