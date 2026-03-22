package practice;

public class a12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,-2,-4,3};
		int sum1=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=1;i<=n;i++)
        {
            for(int a=n-i,b=0;a<n;a++,b++)
            {
            	System.out.println(b+" "+a+"  ");
            	int sum=0,count=0;
                for(int d=b;d<=a;d++)
                {
                	if(nums[d]>=0)
                	{
                		count++;
                	}
                	System.out.print(nums[d]+" ");
                    sum=sum+nums[d];
                }
                System.out.println("\n"+sum);
                //System.out.println(sum);
                if(sum>sum1)
                {
                    sum1=sum;
                }
                if(count>=(a-b)+1)
                {
                	System.out.println(sum1);
                	return;
                }
            }
        }
    System.out.println(sum1);
	}
}
