package TrickPro;

import java.util.Arrays;
import java.util.Collections;

public class p02ReverseArray 
{
	public static void main(String[] args) {
		
		Integer a[]= {1,2,34,2,33,56,43,32};
		
		System.out.println(Arrays.toString(a));
		
		
		Collections.reverse(Arrays.asList(a));
		
		
		System.out.println(Arrays.toString(a));
		
	}
}
