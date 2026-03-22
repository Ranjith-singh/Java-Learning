package sort;

public class quicksort {
	
	public static void sort(int a[],int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(a[j]<a[high])
			{
				i++;
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		i++;
		int temp=a[high];
		a[high]=a[i];
		a[i]=temp;
		sort(a,0,i-1);
		sort(a,i+1,high);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,-1,1,3,5};
		sort(a,0,a.length-1);
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

}
