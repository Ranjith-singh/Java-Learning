package test;

public class test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,1,2,1,4,5,5,6};
		int temp;
		for(int i=a.length;i>0;i--)
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
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
