package enumaration;

public enum color {
	RED("red"),BLUE("blue"),YELLOW("yellow");
	private String value;
	color(String value)
	{
		this.value=value;
	}
	public String Getvalue()
	{
		return value;
	}
	public static void main(String args[])
	{
		color c=color.RED;
		System.out.println("the name="+c.name());
		System.out.println("the value="+c.value);
		for(color col:color.values())
		{
			System.out.println("values "+col.Getvalue());
			System.out.println("values "+col.value);
			System.out.println("name "+col.name());
		}
	}
}
