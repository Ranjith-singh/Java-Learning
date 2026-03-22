package training;

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methods m=new methods();
		System.out.println(m.add(4,5)+" "+m.avg(4,5,5)+" "+m.circle(3)+" "+m.m1(4,5));
		m.m2('c',"",true);
		int a=m.sub(4,5);
		int b=m.sub3(5,4,3);
		int c=m.mul(4,5);
		float d=m.tri(3,4);
		int e=m.square(4);
		float f=m.circle(7);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
