package TrickPro;

public class p11Vovels 
{
	public static void main(String[] args)
	{
		String name="Shubham Chaudhari";
		
		int count=name.replaceAll("[^aeiouAEIOU]", "").length();
		
		System.out.println("No of Vovels: "+count);
	}
}
