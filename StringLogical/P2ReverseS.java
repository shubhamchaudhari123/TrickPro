package StringLogical;

public class P2ReverseS 
{
	public static void main(String[] args)
	{
		String name="java";
		String rev="";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
		}
		
		System.out.println("Reverse String: "+rev);
		
		String course="Python";
		
		String c=new StringBuffer(course).reverse().toString();
		
		System.out.println("Reverse: "+c);
	}
}

