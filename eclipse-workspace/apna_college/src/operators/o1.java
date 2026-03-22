package operators;

public class o1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6,b=8;
		System.out.println(Integer.valueOf('1'));
		System.out.println(Integer.lowestOneBit(a)+"	1");
		System.out.println(Integer.highestOneBit(a)+"	2");
		System.out.println(Integer.BYTES+" 3");
		System.out.println(Integer.toBinaryString(a)+"	4");
		System.out.println(Integer.toHexString(12)+"	5");
		System.out.println(Integer.toOctalString(12)+"	6");
		System.out.println(Integer.bitCount(a)+"	7");
		System.out.println(Integer.SIZE+"	7");
		System.out.println(Integer.max(a, b)+"	8");
		System.out.println(Integer.min(a, b)+"	9");
		System.out.println(Integer.numberOfLeadingZeros(5)+"	10");
		System.out.println(Integer.numberOfTrailingZeros(5)+"	11");
		System.out.println(Integer.remainderUnsigned(a,3)+"	13");
		System.out.println(Integer.reverse(b)+"	14");
		int c=Integer.reverse(b);
		System.out.println(Integer.toBinaryString(c)+"	14");
		System.out.println(Integer.rotateLeft(a,1)+"	15");
		System.out.println(Integer.TYPE+"	16");
	}

}
