package TrickPro;

import java.util.Arrays;
import java.util.Collections;

public class ArayMinMax 
{
	public static void main(String[] args) 
	{
		
		Integer a[]= {2,46,5,22,34,56,3,33,4444,5,7,54455,9099};
		
		System.out.println("All Arrays: "+Arrays.toString(a));
		
		int maxarr=Collections.max(Arrays.asList(a));
		
		int minarr=Collections.min(Arrays.asList(a));
		
		System.out.println("Maximum Array: "+maxarr);
		System.out.println("Minimum Array: "+minarr);
		
	}
}
