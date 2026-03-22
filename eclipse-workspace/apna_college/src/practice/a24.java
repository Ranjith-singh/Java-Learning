package practice;

import java.util.*;

public class a24 {

	public static void main(String[] args) 
	{
		//int nums[]= {-1,0,1,2,-1,-4};
		int nums[]= {-1,0,1,2,-1,-4,-2,-3,3,0,4};
		int n=nums.length;
		// TODO Auto-generated method stub
		List<List<Integer>> a=new LinkedList<>();
		List<Integer> c=new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(i!=j && i!=k && j!=k)
					{
						if(nums[i]+nums[j]+nums[k]==0)
						{
							List<Integer> b=new LinkedList<>();
							b.add(nums[i]);
							b.add(nums[j]);
							b.add(nums[k]);
							if(c.contains(nums[i]) && c.contains(nums[j]) && c.contains(nums[k]))
							{
								continue;
							}
							else
							{
								c.addAll(b);
								a.add(b);
							}
						}
					}
				}
			}
		}
		System.out.println(a);
	}
}
//[[-4,0,4],[-4,1,3],[-3,-1,4],[-3,0,3],[-3,1,2],[-2,-1,3],[-2,0,2],[-1,-1,2],[-1,0,1]]
