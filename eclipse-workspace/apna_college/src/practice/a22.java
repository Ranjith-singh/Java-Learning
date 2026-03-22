package practice;

public class a22 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int nums[] = {2,3,-2,4};
		//int nums[] = {-2,0,-1};
		//int nums[] = {-2,3,-4};
		//int nums[] = {0,2};
		int nums[] = {-3,0,1,-2};
		int n=nums.length;
        int sum=nums[0];
        for(int i=0;i<n;i++)
        {
        	int max=nums[i];
        	System.out.println(max);
        	for(int j=i+1;j<n;j++)
        	{
        		if(sum<max)
        		{
        			sum=max;
        			System.out.println(sum);
        		}
        		max=max*nums[j];
        	}
        	if(sum<max)
    		{
    			sum=max;
    		}
        }
        System.out.println(sum);
	}

}
