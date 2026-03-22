package practice;

public class a10 {
	
	public void a10()
	{
		System.out.println("bounce");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(012);//this 012 is octal because starts from 0 so it converts from octal to decimal
		String message="jai,\"balayya!\"";
		System.out.println(message);
		System.out.println("java"==new String("java"));
		new a10();
		int a=10;
		System.out.println(a=a++);
		System.out.println(a++);
		System.out.println(a);
		String tree ="pine";
		int count=0;
		if(tree.equals("pine"))
		{
			System.out.println("hi");
			count=count+1;
		}
		System.out.println(a+count);
	}

}
