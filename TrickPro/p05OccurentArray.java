package TrickPro;

public class p05OccurentArray 
{
	public static void main(String[] args) 
	{
		
		int a[]= {23,53,2,1,3,6,8,6,5,44,3,2,2,2,2,1};
		
		int target=44;
		int count=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == target)
			{
				count++;
			}
		}
		
		System.out.println("2 Occurence of "+count);
		
	}
}
