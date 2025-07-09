package TrickPro;

public class p12Occurenct 
{
	public static void main(String[] args) 
	{
		
		String name="Shubham Chaudhari";
		
		char target='a';
		
		int count=0;
		
		for(int i=0; i<=name.length()-1; i++)
		{
			if(name.charAt(i)== target)
			{
				count++;
			}
		}
		
		System.out.println("Count Of A Variable: "+count);
		
	}
}
