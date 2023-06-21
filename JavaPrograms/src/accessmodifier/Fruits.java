package accessmodifier;

public class Fruits {

	private String a = "Apple";
	public String o= "Orange";
	String g="Guava";//default
	protected String j="Jackfruit";
	Fruits()
	{
	
	}
	
	Fruits(String o)
	{
		this.o=o;
		System.out.println(o);
	}
}
	


