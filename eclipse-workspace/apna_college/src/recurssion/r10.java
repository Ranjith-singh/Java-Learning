package recurssion;

public class r10 {
	
	public static boolean checksort(int a[],int l)
	{
		if(l==a.length-1)
		{
			return true;
		}
		else if(a[l]>=a[l+1])
		{
			return false;
		}
		return checksort(a,l+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,2,3,4};
		if(checksort(a,0))
		{
			System.out.println("The array is sorted");
		}
		else
		{
			System.out.println("The array is not sorted");
		}
		
	}

}
