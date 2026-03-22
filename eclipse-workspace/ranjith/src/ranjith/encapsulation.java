package ranjith;

class employee1
{
	private String name;
	void getname()
	{
		System.out.println(name);
	}
	void setname(String name)
	{
		this.name=name;
		System.out.println(this.name);
	}
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee1 e1=new employee1();
		//System.out.println(e1.name);
		e1.getname();
		e1.setname("bantu");
		e1.getname();
		e1.setname("ullas");
		e1.getname();
		}
}
