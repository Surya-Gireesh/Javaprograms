package aggregation;

public class Div {
	public static void main(String args[])
	{
		Add ob =new Add();
		int d=ob.add(10,5);
		if(d%10==0)
		{
			System.out.println("divisible by 10");
			
		}
		else
		{
			System.out.println("not possible");
		}
		
		
	}
	

}
