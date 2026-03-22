package sort;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,2,1};
		int temp;
		//In case of String the length is a method but in case of array length is a variable
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
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
			System.out.print(a[i]+" ");
		}
	}
}
