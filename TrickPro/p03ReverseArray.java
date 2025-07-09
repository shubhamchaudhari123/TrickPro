package TrickPro;

import java.util.Arrays;

public class p03ReverseArray
{
	public static void main(String[] args)
	{
		Integer a[]= {3,2,5,7,5,3,4,67,8};
		
		System.out.println(Arrays.toString(a));
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println("Reverse Array: "+a[i]);
		}
	}
}
