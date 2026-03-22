package practice;

public class a6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,2,10,23,3,1,0,20};
		int k=4;
		int sum=0,n=arr.length;
		for(int i=0;i<=n-k;i++)
		{
			if(sum<(arr[i]+arr[i+1]+arr[i+2]+arr[i+3]))
			{
				sum=(arr[i]+arr[i+1]+arr[i+2]+arr[i+3]);
			}
		}
		System.out.println(sum);
	}

}
