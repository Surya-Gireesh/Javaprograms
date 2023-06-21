package demoprograms;
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String args[]) 
	{
		String s1,s2="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		s1=in.nextLine();
		int l=s1.length();
		for(int i=(l-1);i>=0;--i)
		{
			s2=s2+s1.charAt(i);
	    }
			if(s1.equals(s2))
			{
			System.out.println("PALINDROME");
			}
		else
		{
			System.out.println("NOT PALINDROME");
		}
	}

}
