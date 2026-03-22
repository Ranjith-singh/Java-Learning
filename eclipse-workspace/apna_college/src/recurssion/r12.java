package recurssion;

public class r12 {
	
	public static void find(String s,String s1)
	{
		if(s.length()==0)
		{
			if(s1.equals("cba"))
			{
				System.out.println(s1);
				return;
			}
			else
			{
				return;
			}
		}
		for(int i=0;i<s.length();i++)
		{
			String s2=s.substring(0, i)+s.substring(i+1);
			find(s2,s1+s.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		find(s,"");
	}

}
