package recurssion;

public class r11 {
	
	public static void Strappend(String s,int i,int l,String s1)
	{
		if(i==s.length())
		{
			for(int j=0;j<l;j++)
			{
				s1=s1+'x';
			}
			System.out.println(s1);
			return;
		}
		else if(s.charAt(i)=='x')
		{
			l++;
		}
		else
		{
			s1=s1+s.charAt(i);
		}
		Strappend(s,i+1,l,s1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abxxcxd";
		String s1="";
		Strappend(s,0,0,s1);
	}

}
