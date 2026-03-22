package rahul;

import java.util.regex.*;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i will be in the room in 10 minutes";
		Pattern p=Pattern.compile("\\bin\\b");
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println("pattern matched:"+m.group()+" at "+m.start());
	}

}