package TrickPro;

public class p09Reversestring 
{
	public static void main(String[] args)
	{
		
		String name="Shubham Chaudahri";
		
		System.out.println("Original: "+name);
		
		String rev=new StringBuffer(name).reverse().toString();
		
		System.out.println("Revser String: "+rev);
		
	}
}
