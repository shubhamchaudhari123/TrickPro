package ArrayLogical;

import java.util.Arrays;

public class P5MissingNo
{

	public static void main(String[] args) 
	{
		int a[]= {1,3,4,5,6,7};
		
		System.out.println(Arrays.toString(a));
		
		int n=a.length+1;
		
		int expectedsum=0;
		
		for(int i=0; i<a.length; i++)
		{
			expectedsum=expectedsum+a[i];
		}
		
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum Of Element: "+sum);
		
		
		
	}

}
