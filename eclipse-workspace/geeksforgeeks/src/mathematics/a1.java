package mathematics;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int a=0;
	    for(int i=1;i<=n;i=i<<2)
	    {
	        a=a+((n>>i)&(i<<1));
	        a=a+(n&i);
	    }
	    System.out.println(a);
	}

}
