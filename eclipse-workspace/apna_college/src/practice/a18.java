package practice;

public class a18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,2,3,1,2,4,5,5,6};
		int k=4;
		int n=nums.length;
		int lim=Integer.MIN_VALUE;
	    for(int i=0;i<k;i++)
	    {
	    	int max=0;
	    	for(int j=1;j<n;j++)
	        {
	            if(nums[max]<nums[j])
	            {
	                max=j;
	            }
	        }
	        lim=nums[max];
	        nums[max]=Integer.MIN_VALUE;
	        System.out.println(lim);
	    }
        //System.out.println(lim);
	}	
}
