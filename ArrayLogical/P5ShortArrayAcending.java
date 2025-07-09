package ArrayLogical;

import java.util.Arrays;

public class P5ShortArrayAcending {

	public static void main(String[] args)
	{
		int a[]= {86,23,65,22,43,6,4};
		
		System.out.println("Arrays: "+Arrays.toString(a));
		int temp;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted Array: "+ Arrays.toString(a));
		
		System.out.println("Second Largest Array Value: "+a[1]);
	}

}
