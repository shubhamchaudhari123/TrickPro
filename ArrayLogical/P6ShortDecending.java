package ArrayLogical;

import java.util.Arrays;

public class P6ShortDecending
{
	public static void main(String[] args)
	{
		int a[]= {23,44,332,67,88,4,45,60};
		
		System.out.println("Array: "+Arrays.toString(a));
		int temp;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++ )
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Short Decending: "+ Arrays.toString(a) );
		
		
		
	}
}
