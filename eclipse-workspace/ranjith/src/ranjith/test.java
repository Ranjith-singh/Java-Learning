package ranjith;

public class test {
	char a2='a';
	int a=a2;
	long a1=a;
	long x=30l;
	int a3=(int)a1;
	static Integer b=100;
	String str="bro";
	String s="22";
	//int num=int.parseInt(s);  not possible
	int num=Integer.parseInt(s);
	Integer num1=Integer.valueOf(s);
	String s1=Integer.toString(num);
	String s2=String.valueOf(num);
	int ter=a<b?100:200;
	public void test()
	{
	a=11;
	System.out.println("hi");
	}
	public synchronized void nonstatictest()
	{
	System.out.println("non static method "+a);
	}
	public static void statictest()
	{
	System.out.println("static method");
	}
	public static void main(String args[])
	{
		System.out.println("java");
		test t=new test();
		test t1=new test();
		t.nonstatictest();
		test.b=101;		//creating the variable using the object
		System.out.println(test.b);
		System.out.println(t.ter);
		System.out.println(b);
		System.out.println(t1.str);
		statictest();
	}
}
