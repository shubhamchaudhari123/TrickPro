package TrickPro;

public class p10PlindromString
{
	public static void main(String[] args) 
	{
		String name="Madam";
		
		String rev=new StringBuffer(name).reverse().toString();
		
		if(name.equalsIgnoreCase(rev))
		{
			System.out.println("Plindrom..");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
		
		
	}
}
