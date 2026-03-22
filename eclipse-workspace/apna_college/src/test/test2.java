package test;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "heelloooo";
		char string[] = s.toCharArray();
		int count[] = new int[string.length];
		System.out.println("duplicate charecters in given string");
		for (int i = 0; i < string.length; i++) {
			count[i] = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count[i]++;
					string[j] = '\0';
				}
			}
			if (count[i] > 1 && string[i] != '\0')
				System.out.println(string[i] + " " + count[i]);
		}
		int max = 0;
		for (int i = 1; i < count.length; i++) {
			if (count[i] > count[max]) {
				max = i;
			}
		}
		System.out.println("maximum duplicated element in given string");
		System.out.println(string[max] + " " + count[max]);
		/*
		 * StringBuffer sb=new StringBuffer("hello");
		 * sb.append(" world");
		 * System.out.println(sb);
		 * String s1=new String("hello");
		 * sb.append(" world");
		 * System.out.println(sb);
		 */

	}

}
