package practice;

public class a20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[] = {4,2,0,3,2,5};
		//int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		//int height[] = {0,2,0};
		//int height[] = {4,2,3};
		int n=height.length;
	    int sum=0;
	    int a=0;
	    int b=0;
	    for(int i=a+1;i<n;i++)
	    {
	    	if(height[a]<=height[a+1])
	        {
	        	a++;
	        }
	    	else if(height[a]>height[i])
	    	{
	    		if(i>=n-1)
	    		{
	    			if(height[a+1]<height[i])
	    	    	{
	    				sum=sum+(1*(height[i]-height[a+1]));
	    	    	}
	    			else
	    			{
	    			b=0;
	    			}
	    		}
	    		else
	    		{
	    		b=b+(1*(height[a]-height[i]));
	    		System.out.println(b);
	    		}
	    	}
	    	else
	    	{
	    		sum=sum+b;
	    		a=i;
	    	}
	    }
	    System.out.println(sum);
	}

}
