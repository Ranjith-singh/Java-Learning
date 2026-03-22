package test;

public class returnarray {
	
	public int[] sort(int[] a)
	{
		int temp;
		for(int i=a.length;i>1;i--)
		{
			for(int j=0;j<i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {2,4,6,8,0,9,7,5,3,1};
		returnarray ra=new returnarray();
		int a1[]=ra.sort(a);
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}

}
