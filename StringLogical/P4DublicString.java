package StringLogical;

import java.util.Scanner;

public class P4DublicString {

	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String Value: ");
		String value=s.nextLine();
		String re="";
		
		for(int i=0; i<value.length(); i++)
		{
			char ch=value.charAt(i);
			
			if(re.indexOf(ch) == -1)
			{
				re=re+ch;
			}
		}
		
		System.out.print("remov Dublicate : "+re);
		
	}

}
