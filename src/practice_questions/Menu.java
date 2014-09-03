package practice_questions;

public class Menu {
	public static void main(String[] args)
	{
	int a=4,b=6;
	int choice=3;
	short ans=0;
	
	System.out.println("what do you wish to do ?");
	System.out.println("1.check for same last digits ");
	System.out.println("2.one of them is 10 or their sum is 10");
	System.out.println("3.either of them is exact power of 2");
	
	
		switch(choice)
		{
		case 1:
		if(a%10==b%10)
			ans=1;
		break;
		
		case 2:
		if(a==10||b==10||a+b==10)
			ans=1;
		break;
		
		case 3:
			int c=a&(a-1);
			int d=b&(b-1);
			
			if(c==0||d==0)
				ans=1;
		
		break;

		default:System.out.println("enter valid choice number");
		
		}
		if(ans==1)
		System.out.println("true");
		else
		System.out.println("false");
		
	}


}
