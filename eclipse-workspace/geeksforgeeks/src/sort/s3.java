package sort;

public class s3 {
	
	public static int lamuto_partition(int a[],int low,int high)
	{
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(a[j]<a[high])
			{
				i++;
				swap(a,i,j);
			}
		}
		i++;
		swap(a,i,high);
		return i;
	}
	
	public static int hoare_partition(int a[],int low,int high)
	{
		int i=low-1,j=high+1,pivot=a[high];
		while(true)
		{
			do{
				i++;
			} while(a[i]<pivot);
			do {
				j--;
			}while(a[j]>pivot);
			if(i>=j)
			{
				return j;
			}
			swap(a,i,j);
		}
	}
	
	public static void swap(int a[],int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void quicksort(int a[],int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		int i=hoare_partition(a,low,high);// can also use lamuto partition
		quicksort(a,0,i-1);
		quicksort(a,i+1,high);
	}
	
	public static void print_array(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void print_2Darray(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void lamuto_1(int a[],int n)
	{
		int i=-1;
		for(int j=0;j<n;j++)
		{
			if(a[j]<1)
			{
				i++;
				swap(a,i,j);
			}
		}
		print_array(a,a.length);
		i=n;
		for(int j=n-1;j>0;j--)
		{
			if(a[j]>1)
			{
				i--;
				swap(a,i,j);
			}
		}
	}
	
	public static void hoare_1(int a[],int n)
	{
		int i=-1,j=n;
		while(true)
		{
			do{
				i++;
			} while(a[i]<1);
			do {
				j--;
			}while(a[j]>1);
			if(i>=j)
			{
				
				return ;
			}
			swap(a,i,j);
			print_array(a,n);
		}
	}
	
	public static void boundery(int a[][])
	{
		int n=a.length,m=a[0].length;
		int i=0,j=0;
		while((i<n) && (j<m))
		{
			for(int k=j;k<m-1;k++)
			{
				System.out.print(a[i][k]+" ");
			}
			for(int k=i;k<n-1;k++)
			{
				System.out.print(a[k][m-1]+" ");
			}
			for(int k=m-1;k>j;k--)
			{
				System.out.print(a[n-1][k]+" ");
			}
			for(int k=n-2;k>i;k--)
			{
				System.out.print(a[k][j]+" ");
			}
			System.out.print(", ");
			i++;
			j++;
			n--;
			m--;
		}	
	}
	
	public static void transpose(int a[][])
	{
		int n=a.length,m=a[0].length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,4,7,9,3,10,5};
		int n=a.length;
		quicksort(a,0,n-1);
		print_array(a,n);
		int a1[]= {2,1,2,0,0,1};
		hoare_1(a1,a1.length);
		print_array(a1,a1.length);
		int a2[][]= {{1,2,3,4},
					{12,13,14,5},
					{11,16,15,6},
					{10,9,8,7}};
		boundery(a2);
		transpose(a2);
		System.out.println();
		print_2Darray(a2);
		}
	}
