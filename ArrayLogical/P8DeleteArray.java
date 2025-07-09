package ArrayLogical;

import java.util.Arrays;

public class P8DeleteArray 
{

	public static void main(String[] args) 
	{
		int a[]= {12,53,75,77,45,35,33};
		
		System.out.println("Array: "+Arrays.toString(a));
		
		int delete=77;
		
		for(int i=0; i<a.length; i++)
		{
			if(delete == a[i])
			{
				for(int j=i; j<a.length-1; j++)
				{
					a[j]=a[j+1];
				}
				break ;
			}
		}
	
		System.out.println("After Delete: "+Arrays.toString(a));
	}

}
