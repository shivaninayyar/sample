package practice_questions;

public class Sumofdigits {
	
		public static void main(String[] args)
		{
		int x=34567;
		int sum=0;
		int r;
		while(x!=0)
		{
		r=x%10;
		sum=sum+r;
		x=x/10;
		}
			

		System.out.println("the sum is "+sum);
		}
	}



