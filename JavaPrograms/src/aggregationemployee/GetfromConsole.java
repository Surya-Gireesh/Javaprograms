package aggregationemployee;
import java.util.Scanner;
public class GetfromConsole {
	double basic,bonus,ded;
public void getDetails()
{
	//double basic,bonus,ded;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the basic salary");
	basic=in.nextDouble();
	System.out.println("Enter the deduction amt");
	ded=in.nextDouble();
	System.out.println("Enter the bonus amount");
	bonus=in.nextDouble();
	}
}
