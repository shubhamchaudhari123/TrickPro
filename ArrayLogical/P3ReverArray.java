package ArrayLogical;

import java.util.Arrays;

public class P3ReverArray {

	public static void main(String[] args) 
	{
	
		int a[]= {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("Rever List....");
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
