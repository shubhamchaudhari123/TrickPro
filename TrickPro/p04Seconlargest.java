package TrickPro;

import java.util.Arrays;
import java.util.Collections;

public class p04Seconlargest
{
	public static void main(String[] args)
	{
		
		int a[]= {34,5,75,34,7,8,77,69,4};
		
		int sum=0;
		System.out.println("Regular Array: "+Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length; i++)
		{
			
			sum = sum + a[i];
		}
		
		System.out.println("Total Sume Of Array: "+sum);
		
		System.out.println("This is second Largest: "+a[1]);
		
		
	}
}
