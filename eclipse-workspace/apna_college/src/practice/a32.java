package practice;

import java.util.*;

public class a32 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[] = {3, 4, 65};
		int start = 7, end = 66175;
        int[] ans = new int[100001];
        Arrays.fill(ans, -1);
        int mod = 100000;
        Queue<Integer> q = new LinkedList<>();
        q.add(start % mod);
        ans[start] = 0;
        while (!q.isEmpty()) {
            int top = q.poll();
            if (top == end) 
            	System.out.println(ans[end]);
            for (int i = 0; i < arr.length; i++) {
                int pushed = top * arr[i];
                pushed = pushed % mod;
                System.out.println(pushed);
                if (ans[pushed] == -1) {
                    ans[pushed] = ans[top] + 1;
                    q.add(pushed);
                }
            }
        }
        System.out.println(-1);;
	}

}
