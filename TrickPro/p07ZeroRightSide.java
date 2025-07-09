package TrickPro;

import java.util.Arrays;

public class p07ZeroRightSide
{
	public static void main(String[] args)
	{
		
		int a[]= {23,0,34,30, 0, 0 ,24,32,68,23,0,0,0,4,30,0};
		
		int temp;
		int zeroin=0;
		
		for( int i=0; i<a.length; i++)
		{
			if(a[i] == 0)
			{
				 temp= a[i];
				a[i]=a[zeroin];
				a[zeroin]=temp;
				
				zeroin++;
			}
		}
		
		System.out.println("Shorted Array: "+Arrays.toString(a));
		
		
	}
}
