package bit_manipulation;

public class bm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int pos=3;
		int bitmask=1<<pos;
		a=a|(bitmask);
		System.out.println(Integer.toBinaryString(a));
	}

}
