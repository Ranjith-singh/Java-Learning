package recursion;

public class r6 {
	
	static int id=0;
	public static void r()
	{
		if(id<=5)
		{
			System.out.println("hello");
		}
		return;
	}
	public static boolean palindrome(int s,int e,String s1)
	{
		if(s>=e)
		{
			return true;
		}
		return s1.charAt(s)==s1.charAt(e) && palindrome(s+1,e-1,s1);
	}
	
	public static void subset(String s,String s1,int i)
	{
		if(i==s.length())
		{
			System.out.print(s1+" ");
			return;
		}
		subset(s,s1+s.charAt(i),i+1);
		subset(s,s1,i+1);
	}
	
	public static void perm(String s,int i)
	{
		int n=s.length();
		if(i==(n-1))
		{
			System.out.print(s+" ");
		}
		for(int j=i;j<n;j++)
		{
			swap(s.charAt(i),s.charAt(j));
			perm(s,i+1);
			swap(s.charAt(i),s.charAt(j));
		}
	}
	
	public static void swap(char i,char j)
	{
		char temp=i;
		i=j;
		j=temp;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			r(); 
		}
		System.out.println();
		String s="malayalam";
		System.out.println(palindrome(0,s.length()-1,s));
		String s1="abc";
		System.out.println();
		subset(s1,"",0);
		System.out.println();
		perm(s1,0);
	}

}
