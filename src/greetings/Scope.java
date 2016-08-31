package greetings;

public class Scope {
	
	private static int age = 50;
	
	public static void main(String[] args) 
	{
		System.out.println("Hey");
		
		{
			//int age = 25;
		}
		
		//int age = 30;
		
		System.out.println(age);
		
	}

}
