package ranjith;

// if the 2 classes are loosely associated then the then they are agreegated

class Name
	{
	String first,last;
	Name(String first,String last)
	{
	this.first=first;
	this.last=last;
	}
}
class empinfo{
	int id;
	Name name;
	empinfo(int id,Name name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
	System.out.println(id+" "+name.first+" "+name.last);
	//if we use name directly the address where it is stored will be displayed
	//ex: name op:ranjithName@id1203...
	}
}

public class has_a {
	public static void main(String args[])
	{
		Name name=new Name("john","smith");
		empinfo e=new empinfo(209,name);
		e.display();
	}
}
