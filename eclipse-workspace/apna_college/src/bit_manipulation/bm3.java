package bit_manipulation;

public class bm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int pos=2;
		int b=1<<pos;
		int bitmask=~b;
		a=a&bitmask;
		System.out.println(a);
	}
}
