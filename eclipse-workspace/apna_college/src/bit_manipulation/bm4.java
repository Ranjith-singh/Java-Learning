package bit_manipulation;

public class bm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=64;
		int b=(int)Math.cbrt(a);
		if(b==Math.cbrt(a))
		{
			if(Integer.bitCount(b)==1)
			{
				System.out.println(a+" is a power of 8");
			}
		}
		if(Integer.bitCount(a)==1)
		{
			System.out.println(a+" is a power of 2");
		}
		else
		{
			System.out.println(a+" is not a power of 2");
		}
	}

}
