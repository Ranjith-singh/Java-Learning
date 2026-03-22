package practice;

public class a13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {4,-1,-3,-5,5};
		int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            max = Math.max(sum,max);
            if(sum<0) 
            {
            	sum = 0;
            }
        }
        
        System.out.println(max);
	}
}
