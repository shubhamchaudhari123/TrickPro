package ArrayLogical;

import java.util.Arrays;

public class P7DublicateArray {

	public static void main(String[] args) 
	{
		
		int a[]= {3,2,6,32,77,32,22,4,3};
		
		System.out.println("Arrays: "+Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j] )
				{
					System.out.println("This is dublicate Array: "+a[i]);
					break;
				}
			}
		}
		
		
		
	}

}
