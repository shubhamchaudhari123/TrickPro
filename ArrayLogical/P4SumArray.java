package ArrayLogical;

import java.util.Arrays;

public class P4SumArray {

	public static void main(String[] args) 
	{
		int a[]= {23,42,75,855};
		
		System.out.println(Arrays.toString(a));
		
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Addtion of Array: "+sum);
		

	}

}
