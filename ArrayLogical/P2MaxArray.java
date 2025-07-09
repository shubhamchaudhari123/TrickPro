package ArrayLogical;

import java.util.Arrays;

public class P2MaxArray {

	public static void main(String[] args)
	{
		
		int a[]= {34,53,88,24,89};
		
		int max=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("Maximum Element: "+max);

	}

}
