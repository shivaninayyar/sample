package practice_questions;

public class Smallestdistance {

	public static void main(String[] args) 
	{
		int[] a={4,8,6,1,2,9,4};
		int i;
		int diff=0;
		int small=a[1]-a[0],pos=0;
		
		for(i=2;i<6;i++)
		{
			diff=Math.abs(a[i+1]-a[i]);
			
				if(diff<small)
				{
					pos=i;
					small=diff;
				}
		}
		
		System.out.println("the number is at index "+pos);
				
			
			
		
	}

}
