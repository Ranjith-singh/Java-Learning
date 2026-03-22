package practice;

import java.util.*;

public class a14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,1};
		//brute force O(n)
		for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
            	if(nums[i]==nums[j])
            	{
            		System.out.println("found 1");
            	}
            }
        }
		//O(log n)
		Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n-1; i++) 
        {
            if (nums[i] == nums[i+1])
            {
            	System.out.println("found 2");
            }    
        }
        //O(n)
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
        	if(hs.contains(nums[i]))
        	{
        		System.out.println("found 3");
        	}
        	hs.add(nums[i]);
        }
	}

}
