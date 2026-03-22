package ranjith;

class sum
{
	int a,b,c;
	
	public int perform()
	{	
		c=a+b;
		return c;
	}
}
class extend extends sum
{
	public int perform1(int a,int b)
	{
	c=b-a;
	return c;	
}

public class loops
{
	public static void main(String[] args)
	{
		extend obj=new extend();
		obj.a=1;
		obj.b=2;
		System.out.print(obj.perform1(1,2));
	}
}
}