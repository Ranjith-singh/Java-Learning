package bit_manipulation;

public class bm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-5;
		int pos=2;
		int bitmask=1<<pos;
		if((a & bitmask)==0)
		{
			System.out.println("bit was zero");
		}
		else
		{
			System.out.println("bit was one");
		}
	}

}
