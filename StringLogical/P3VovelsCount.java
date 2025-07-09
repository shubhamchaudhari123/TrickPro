
package StringLogical;

import java.util.Scanner;

public class P3VovelsCount {

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String: ");
		String ss=s.next()+s.nextLine();
		
		System.out.println("Length Of String: "+ss.length());
		
		int vovelsC=0;
		int nonv=0;
		
		for(int i=0; i<ss.length(); i++)
		{
			char ch=ss.charAt(i);
			
			if( "AEIOUaeiou".indexOf(ch) != -1)
			{
				vovelsC++;
			}
			else if(Character.isLetter(ch))
			{
				nonv++;
			}
			
		}
		
		System.out.println("vovels: "+vovelsC);
		System.out.println("Non Vovels Ch: "+nonv);
		
		
	}

}
