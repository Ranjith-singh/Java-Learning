package array;

public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3};
		boolean asc=true;
		boolean dec=true;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1]) 
			{
				asc=false;
			}
			if(a[i]<a[i+1]) 
			{
				dec=false;
			}
		}
		if(asc==true)
		{
			System.out.println("It is ascending order");
		}
		else if(dec==true)
		{
			System.out.println("It is decending order");
		}
		else
		{
			System.out.println("It is neither in ascending order or decending oerder");
		}
	}
}
