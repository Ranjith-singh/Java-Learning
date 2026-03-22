package rahul;

import java.util.regex.*;

public class regexdemo {
	public static void main(String args[])
	{
		try {
			System.out.println(29/0);
			}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by 0"+e.getMessage());
		}
		//System.out.println(29/0);
		//String pattern="[a-z]+";
		String pattern="\\bTo\\b";
		String check="Happy Learing! Welcome To the To Edureka Tomorrow";
		Pattern p=Pattern.compile(pattern);
		Matcher c=p.matcher(check);
		while(c.find())
			System.out.println(check.substring(c.start(),c.end()));
			System.out.println(c.start());
	}
}
