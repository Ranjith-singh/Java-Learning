package practice;

import java.util.Arrays;

public class a21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[]= {1,2,3,4};
		int nums[]= {-1,1,0,-3,3};
		int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
	}

}
