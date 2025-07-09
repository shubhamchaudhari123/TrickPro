package StringLogical;

import java.util.Scanner;

public class p5PalindromStr
{
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Any No: ");
		String pali=s.next()+s.nextLine();
		
		String rev=new StringBuffer(pali).reverse().toString();
		
				
		
			if(pali.equals(rev.toString()))
			{
				System.out.println("Palindrom NO: ");
			}
			else
			{
				System.out.println("Not Palindrom...");
			}
		
		
		s.close();
	}
}
