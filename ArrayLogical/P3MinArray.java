package ArrayLogical;

import java.util.Arrays;

public class P3MinArray {

	public static void main(String[] args)
	{
		
		int a[]= {35,85,22,46,34};
		
		int min=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println("Minimun Element: "+min);

	}

}
