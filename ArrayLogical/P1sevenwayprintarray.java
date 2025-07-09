package ArrayLogical;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class P1sevenwayprintarray 
{
	public static void main(String[] args)
	{
		String arr[]= {"one","two","three","four","five"};
		
		Arrays.asList(arr).forEach(element -> System.out.println("First Way: "+element));
		
		System.out.println("------------------------------------");
		System.out.println("Second Way array.stream");
		Arrays.stream(arr).forEach(System.out::println);
		
		System.out.println("------------------------------------");
		System.out.println("third way array stream.of");
		Stream.of(arr).forEach(System.out::println);
		
		System.out.println("--------------------------------------");
		System.out.println("Forth Way ForLoop.. ");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("----------------------------------------");
		System.out.println("Fifth Way Inhance ForLoop..");
		
		 for(String e:arr)
		 {
			 System.out.println(e);
		 }
		 
		 System.out.println("---------------------------------------");
		 System.out.println("Sixth Way ToString Method... ");
		 
		 System.out.println(Arrays.toString(arr));
		 
		
		
	}
}
