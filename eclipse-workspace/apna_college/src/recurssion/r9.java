package recurssion;

public class r9 {
	
	public static int first=-1;
	public static int last=-1;
	
	public static void occurence(String s,int n,char element)
	{
		if(n==s.length())
		{
			System.out.println("element first index "+first+" and last index is "+last);
			return;
		}
		else if(s.charAt(n)==element)
		{
			if(first==-1)
			{
				first=n;
			} 
				last=n;
		}
		occurence(s,++n,element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdab";
		char element='a';
		occurence(s,0,element);
	}
}