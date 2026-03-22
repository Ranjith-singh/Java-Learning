package ranjith;

public class string {
	public static void main(String args[])
	{
		String s1="Begin";
		String s2="hello";
		String s3="";
		
		String replace;
		int i=100;
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.hashCode());
		s1.substring(2);
		System.out.println(s1.substring(2).hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s1);
		System.out.println(s1.substring(2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.concat(" everyone"));
		System.out.println(s3.isEmpty());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.valueOf(i).concat(" is a value")); // value of converts it into string
		System.out.println(s1.replace('i', 'g'));
		System.out.println(s1.contains("a"));
		System.out.println(s1.toLowerCase().equals("hello"));
		System.out.println(s1.toLowerCase().equals("begin"));
		System.out.println(s1.endsWith("o"));
		StringBuffer s=new StringBuffer("happy ending");
		
		StringBuffer sb1=new StringBuffer("");
		//StringBuffer sb="hello1";
		System.out.println(s);
		System.out.println(s.hashCode());
		s.append(" bro");
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s);
		s.insert(0,'w');
		System.out.println(s);
		s.insert(2,'e');
		System.out.println(s);
		s.replace(0, 2, "hhe");
		System.out.println(s);
		s.delete(0, 1);
		//arg1 specifies the starting position and arg2 specifies the no of positions
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.capacity();
		System.out.println(s.capacity());
		System.out.println(s);
		System.out.println(sb1.capacity());
		/* string builder is used instead of the string buffer because its faster but 
		  it's not thread safe 
		  So if the mutiple threads are accessing the same string then use
		  String buffer
		  But if only single thread is accessing the string then use string builder for
		  performance
		 */
		StringBuilder str=new StringBuilder("welcome");
		str.append(" all");
		System.out.println(str);
		//s1=s1.concat("everyone");
		System.out.println(s1);
	}

}
