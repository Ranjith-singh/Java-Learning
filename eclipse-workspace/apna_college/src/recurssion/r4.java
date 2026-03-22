package recurssion;

public class r4 {
	
	public static void print(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(Integer.hashCode(6));
		print(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n=5;
		print(n);
		System.out.println(n.hashCode());
	}

}
