package array;

public class a1 {

	static String colName (long n)
    {
        // your code here
        String s="";
        long i=0;
        while(n!=0)
        {
            i=n%26;
            if(i<=0)
            {
            	i=26-i;
            	n=n-26;
            }
            System.out.println(i+" "+n/26);
            s=(char)(i+'A'-1)+s;
            n=n/26;
        }
        return s;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(colName(5473578));
		for(char c='A';c<='z';c++)
		{
			System.out.print(c);
		}
	}

}
