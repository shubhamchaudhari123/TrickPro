package TrickPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p06DeleteArray 
{
	public static void main(String[] args)
	{
		Integer a[]= {34,3,67,233,90,54};
		
		int target=3;
	
		
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(a));
		
		System.out.println(list);
		
		list.remove(Integer.valueOf(target));
		
		
	
		System.out.println(list);
	}
}
