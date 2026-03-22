package practice;

import java.util.*;

public class a19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3};
		int k=1;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) 
        {
            System.out.println(pq.offer(nums[i]));
        }
        System.out.println(pq);
        for (int i = k; i < nums.length; i++) {
        	System.out.println(nums[i]+" "+pq.peek());
            if (nums[i] > pq.peek()) {
                System.out.println(pq.poll());
                pq.offer(nums[i]);
                System.out.println(pq);
            }
        }
        System.out.println(pq.peek());
	}

}
