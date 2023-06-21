package encapsulation;

public class StudMain {
	public static void main (String args[])
	{
		Student ob=new Student();
		Address ad=new Address();
		ob.setName("SURYA");
		ob.setRollno(22);
		ad.setLine1("Address line1");
		ad.setLine2("Address line 2");
		ad.setCity("City");
		ad.setState("State");
		ob.setAddress(ad);

		System.out.println(ob.getName());
		System.out.println(ob.getRollno());
		System.out.println(ob.getAddress().getLine1());
		System.out.println(ob.getAddress().getLine2());
		System.out.println(ob.getAddress().getCity());
		System.out.println(ob.getAddress().getState());
		
		
		
	}

}