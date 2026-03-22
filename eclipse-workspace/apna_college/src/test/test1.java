package test;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40};
		int a1[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
				if(i==j)
				{
					a1[j]=a[(i+1)%a.length]*a[(i+2)%a.length]*a[(i+3)%a.length];
				}
			}
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+"\t");
		}
	}

}
