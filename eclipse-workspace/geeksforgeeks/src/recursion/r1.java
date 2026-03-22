package recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class r1 {

	public static void printnto1(int n)
	{
		if(n==1)
		{
			System.out.println(n);
			return;
		}
		System.out.println(n);
		printnto1(n-1);
	}

	public static void print1ton(int n)
	{
		if(n==1)
		{
			System.out.println(n);
			return;
		}
		print1ton(n-1);
		System.out.println(n);
	}

	public static int fact(int n,int sum)
	{
		if(n==0 || n==1)
		{
			return sum;
		}
		return fact(n-1,sum*n);
	}

	public static int fib(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

	public static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n+sum(n-1);
	}

	public static boolean palindrome(String s)
	{
		int n=s.length();
		if(n==0 ||n==1)
		{
			return true;
		}
		return s.charAt(0)==s.charAt(n-1) && palindrome(s.substring(1,n-1));
	}

	public static int sumofdigits(int n,int sum)
	{
		if(n==0)
		{
			return sum;
		}
		return sumofdigits(n/10,sum+(n%10));
	}

	public static int rope(int n,int a,int b,int c)
	{
		if(n==0)
		{
			return 0;
		}
		if(n<0)
		{
			return -1;
		}
		int res=Math.max(rope(n-a,a,b,c),Math.max(rope(n-b,a,b,c),rope(n-c,a,b,c)));
		if(res==-1)
		{
			return -1;
		}
		return res+1;
	}

	public static void subset(String s,String s1)
	{
		int n=s.length();
		if(n==0)
		{
			System.out.println(s1);
			return;
		}
		subset(s.substring(0,n-1),s1);
		subset(s.substring(0,n-1),s1+s.charAt(n-1));
	}

	public static void towerofhonai(int n,String s,String a,String d)
	{
		if(n==1)
		{
			System.out.println("move disc "+n+" from "+s+" to "+d);
			return;
		}
		towerofhonai(n-1,s,d,a);
		System.out.println("move disc "+n+" from "+s+" to "+d);
		towerofhonai(n-1,a,s,d);
	}

	public static int jos(int n,int k)
	{
		if(n==1)
		{
			return 0;
		}
		return (jos(n-1,k)+k)%n;
	}

	public static int subsum(int a[],int n,int sum)
	{
		if(sum==0)
		{
			return 1;
		}
		if(n==0 || sum<0)
		{
			return 0;
		}
		return subsum(a,n-1,sum-a[n-1])+subsum(a,n-1,sum);
	}

	public static void perm(String s,String s1)
	{
		if(s.length()==1)
		{
			System.out.println(s1+s);
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			perm(s.substring(0,i)+s.substring(i+1),s1+s.charAt(i));
		}
	}

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
	
	public static void add_arrays(int a[],int b[])
	{
		int m=a.length;
		int n=b.length;
		int o=m+n;
		int c[]=new int[o];
		int i=0,j=0;
		while(i<m && j<n)
		{
			if(a[i]<b[j])
			{
				c[i+j]=a[i];
				i++;
			}
			else
			{
				c[i+j]=b[j];
				j++;
			}
		}
		while(i<m)
		{
			System.out.println(i+" "+j);
			c[i+j]=a[i];
			i++;
		}
		while(j<n)
		{
			c[i+j]=b[j];
			j++;
		}
		print_array(c);
	}
	
	public static void print_array(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void swap(char a,char b)
	{
		char temp=a;
		a=b;
		b=temp;
	}

	static ArrayList<String> pow(String s,String s1,int n)
    {
        ArrayList<String> a=new ArrayList<>();
        if(n==s.length())
        {
           a.add(s1);
           return a;
        }
        a.addAll(pow(s,s1,n+1));
        a.addAll(pow(s,s1+s.charAt(n),n+1));
        return a;

    }
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        return pow(s,"",0);
    }

    static void possibleWords(int a[], int N)
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

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printnto1(5);
		//print1ton(5);
		System.out.println(fact(5,1)+" "+fib(5)+" "+sum(5)+" "+palindrome("abccba")+" "+sumofdigits(10,0));
		System.out.println(rope(5,2,5,1));
		subset("abc","");
		String s="source",a="auxillary",d="destination";
		towerofhonai(3,s,a,d);
		int a1[]= {10,5,3,2,6};
		int a2[]= {10,20,15};
		System.out.println(jos(7,3)+" "+subsum(a1,a1.length,8)+" "+subsum(a2,a2.length,37));
		perm("abc","");
		System.out.println();
		perm1("abc",0);
		System.out.println(powerSet("abc"));
		int a3[]= {2,3,4};
		possibleWords(a3,3);
		System.out.println();
		int b1[]={1,2,3,4,5};
		int b2[]={2,4,6,8};
		add_arrays(b1,b2);

	}

}
