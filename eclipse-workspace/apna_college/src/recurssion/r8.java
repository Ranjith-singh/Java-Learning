package recurssion;

public class r8 {
	
	public static void reverse(String s,int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.print(s.charAt(n-1));
		reverse(s,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		reverse(s,s.length());
	}
}
