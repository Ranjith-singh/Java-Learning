package test;

public class test8 {
	static void quicksort(int[] a,int low,int high)
	{
		if(low<high)
		{
			int pi=partition(a,low,high);
			quicksort(a,low,pi-1);
			quicksort(a,pi+1,high);
		}
	}
	static void swap(int[] a,int i,int j)
	{
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	static int partition(int[] a,int low,int high)
	{
		int pivot =a[high];
		int i=low-1;
		for(int j=low;j<=high;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,high);
		return (i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,6,8,0,9,7,5,3,1};
		int low=0;
		int high=a.length-1;
		test8 t8=new test8();
		quicksort(a, low, high);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
