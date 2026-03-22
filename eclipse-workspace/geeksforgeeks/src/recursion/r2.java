package recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class r2 {

	public static void perm1(String s,int i)
	{
		if(i==s.length()-1)
		{
			System.out.println(s);
		}
		for(int j=i;j<s.length();j++)
		{
			swap(s.charAt(i),s.charAt(j));
			perm1(s,i+1);
			swap(s.charAt(i),s.charAt(j));
		}
	}

	public static void swap(char a,char b)
	{
		char temp=a;
		a=b;
		b=temp;
	}

	static ArrayList<String> possibleWords(int a[], int N)
    {
        // your code here
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=2,k=0;i<10;i++,k=k+3)
        {
            String s="";
            s=s+(char)('a'+k)+(char)('a'+(k+1))+(char)('a'+(k+2));
            map.put(i,s);
        }
        map.put(9,map.get(9)+'z');
        System.out.println(map);
        return pw(a,N,map,"",0);
    }
	static ArrayList<String> pw(int a[],int N,HashMap<Integer,String> map,String s,int i)
	{
		ArrayList<String> al=new ArrayList<>();
		if(i==N)
		{
			al.add(s);
			return al;
		}
		for(int j=0;j<map.get(a[i]).length();j++)
		{
			al.addAll(pw(a,N,map,s+(map.get(a[i])).charAt(j),i+1));
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4};
		System.out.println(possibleWords(a,3));
	}

}
