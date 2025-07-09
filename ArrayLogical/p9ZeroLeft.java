package ArrayLogical;

import java.util.Arrays;
import java.util.Scanner;

public class p9ZeroLeft {

	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the size of Array: ");
		int size=s.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print("Enter Array Values: ");
			a[i]=s.nextInt();
		}
		
		System.out.println("Your Array: "+Arrays.toString(a));
		
		int[] result = new int[size];
	    int index = 0;

        for (int i = 0; i < a.length; i++)
        {
        	if (a[i] != 0)
        	{
	            result[index++] = a[i];
	        }
	    }
	        
        
	    System.out.println("After moving zeros to right: " + Arrays.toString(result));

		
		
	}

}

