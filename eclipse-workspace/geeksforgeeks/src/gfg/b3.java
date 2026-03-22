package gfg;

public class b3 {
	
	public static int nummax(int a,int[] arr)
    {
        int sum=0,max=0;
        if(a>=arr.length)
        {
        	return 0;
        }
        for(int i=a;i<arr.length;i++)
        {
        	sum=arr[a]+nummax(a+2,arr);
        	if(max<sum)
        	{
        		max=sum;
        	}
        }
        return max;
    }
    public static int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int sum=0,a=0;
        for(int i=0;i<n;i++)
        {
           a=(nummax(i,arr));
           if(sum<a)
           {
        	   sum=a;
           }
        }
        return sum;
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {9,4,11,12,6,12};
		int a1[]= {6,5,5,7,4};
		int a2[]= {1,5,3};
		int n=6;
		int st=(int)(System.nanoTime()/1000000);
		System.out.println(FindMaxSum(arr,n));
		System.out.println(FindMaxSum(a1,5));
		System.out.println(FindMaxSum(a2,3));
		int ed=(int)(System.nanoTime()/1000000);
		System.out.println(ed-st);
		System.out.println((40>>-2));
		
	}

}
