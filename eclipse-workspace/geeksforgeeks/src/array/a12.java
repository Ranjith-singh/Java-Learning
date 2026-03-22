package array;

public class a12 {
	
	public static int remove_dup(int a[],int n)
	{
		int dup=0;
		for(int i=1;i<n;i++)
		{
			if(a[dup]!=a[i])
			{
				dup++;
				a[dup]=a[i];
			}
		}
		dup++;
		return dup;
	}
	
	public static void print_array(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void max_diff(int a[],int n)
	{
		int diff=0,max=a[1]-a[0];
		for(int i=1;i<n;i++)
		{
			max=Math.max(max,a[i]-a[diff]);
			if(a[i]<a[diff])
			{
				diff=i;
			}
			System.out.println(max);
		}
		System.out.println(max);
	}
	
	static int pre[];
	
	public static void initialize(int a[],int n)
	{
		pre=new int[n];
		pre[0]=a[0];
		for(int i=1;i<n;i++)
		{
			pre[i]=pre[i-1]+a[i];
		}
	}
	
	public static int range_sum(int l,int r)
	{
		if((l-1)>=0)
		{
			return pre[r]-pre[l-1];
		}
		return pre[r];
	}
	
	public static void ascii(String s)
	{
		String s1="";
		int n=s.length();
		int i=0;
		while(i<n)
		{
			int num=Integer.parseInt(s.substring(i,i+2));
			i=i+2;
			if(num==32 || (num>=65 && num<=90) || num>=97)
			{
				s1=s1+(char)num;
			}
			else 
			{
				num=num*10+Integer.parseInt(s.substring(i,i+1));
				s1=s1+(char)num;
				i++;
			}
		}
		System.out.println(s1);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {1,2,2,2,3,3,4,4,5,5};
		int n=remove_dup(a,a.length);
		print_array(a,n);
		System.out.println();
		int a1[]= {2, 1, 3, 4, 2, 1, 5, 1, 7};
		max_diff(a1,a1.length);
		System.out.println();
		int a2[]={ 3, 6, 2, 8, 9, 2 };
		initialize(a2,a2.length);
		print_array(pre,a2.length);
		System.out.println();
		System.out.println(range_sum(1, 5));
		System.out.println();
		ascii("801141011127311011511697");
		String s="65";
		int num=s.charAt(0)+s.charAt(1);
		int num1=Integer.parseInt(s);
		System.out.println(num+" "+num1);
	}

}
