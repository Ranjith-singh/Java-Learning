package ranjith;

interface money1
{
	void operation();
}
class debit implements money1
{
	public void operation()
	{
		System.out.println("debiting the money");
	}
}
class credit implements money1
{
	public void operation()
	{
		System.out.println("crediting the money");
	}
}
public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		money1 m=new credit();
		money1 m1=new debit();
		m.operation();
		m1.operation();
	}

}
