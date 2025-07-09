package TrickPro;

import java.util.Arrays;

public class p08DublicateElement 
{
	public static void main(String[] args) 
	{
		
		int a[] = {1,4,2,5,76,4,2,1,345};
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("Dublicate Elemet: "+a[i]);
					
				}
			}
		}
		
	}
	
}
