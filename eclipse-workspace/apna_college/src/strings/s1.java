package strings;

public class s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Ranjith Singh";
		String res="";
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='i')
			{
				res=res+"e";
			}
			else
			{
				res=res+a.charAt(i);
			}
		}
		System.out.println(res);
	}

}
