package string;

import java.util.HashSet;

public class s1 {

	static long substrCount (String S, int K)
    {
        // your code here
        long ans=0;
        int n=S.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>=0;j--)
            {
                HashSet<Character> set=new HashSet<>();
                for(int k=(i-j);k<n-j;k++)
                {
                    set.add(S.charAt(k));
                }
                if(set.size()==K)
                {
                	System.out.println(set);
                    ans++;
                }
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(substrCount("abaaca",1));
		String s="hello"+"world";
		System.out.println(s);
	}

}
