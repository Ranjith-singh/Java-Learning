package practice;

import java.util.ArrayList;

public class a23 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[] = {6, 8, 9, 10, 11, 15};
		int x =21;
		int n=arr.length;
		ArrayList<Integer> a3=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			a3.add(arr[i]);
		}
		System.out.println(a3);
		for(int i=0;i<n-1;i++)
		{
			a3.remove(0);
			if(a3.contains(x-arr[i]))
			{
				System.out.println("found");
				break;
			}
		}
	}
}
