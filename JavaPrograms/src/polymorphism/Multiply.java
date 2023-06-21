package polymorphism;

public class Multiply extends Product {
	@Override

	public int findProduct(int n,int m)
	{
		return(n*m*100);
		
	}
	public static void main(String args[])
	{
		Product p=new Multiply();
		System.out.println(p.findProduct(20, 10));
	}
	
}
