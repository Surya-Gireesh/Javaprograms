package aggregationemployee;

public class FindtotalSal {
	double tot;
	Calculatehra ob;
	GetfromConsole gb;

	public double findSalary()
	{
		double tot=gb.basic+ob.calHra(gb.basic)-ob.calpf(gb.basic)-gb.ded+gb.bonus;
		return tot;
	}
	public static void main(String args[])
	{
	     
		 GetfromConsole gb=new GetfromConsole();
		 gb.getDetails();
		 Calculatehra ob=new Calculatehra();
		 FindtotalSal f=new FindtotalSal();
		
		System.out.println("SALARY SLIP");
		System.out.println("BASIC PAY "+gb.basic);
		System.out.println("DEDUCTION "+gb.ded);
		System.out.println("HRA "+ob.calHra(gb.basic));
		System.out.println("PF "+ob.calpf(gb.basic));
		System.out.println("BONUS "+gb.bonus);
		System.out.println("TOTAL SALARY BY HAND "+f.tot);
		
		
		
		
		
	}

}
