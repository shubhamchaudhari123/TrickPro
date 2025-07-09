package StringLogical;

public class P1ReverseString {

	public static void main(String[] args) 
	{
		
		String s="0978688";
		
		System.out.println("Regular String: "+s);
		
		String reversed=new StringBuffer(s).reverse().toString();
		
		System.out.println("Reversed Order: "+ reversed);

	}

}
