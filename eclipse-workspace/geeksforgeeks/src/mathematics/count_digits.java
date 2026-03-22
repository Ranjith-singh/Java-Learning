package mathematics;

public class count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12345;
		int count=0;
		while(x!=0)
		{
			count++;
			x=x/10;
		}
		System.out.println(count);
	}

}
