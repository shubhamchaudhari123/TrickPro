package TrickPro;

public class p13SpaceRemove 
{
	public static void main(String[] args) 
	{
		
		String name="Shubhamc Is Java Devloper";
		
		System.out.println("Simple Name: "+name);
		
		String space=name.replaceAll("\\s", "");
		
		System.out.println("Removing Space: "+space);
		
	}
}
