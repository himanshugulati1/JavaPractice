package exceptionhandling;

public class Finally {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c;
		try
		{
			c=a/b;
		}
		catch(Exception e)
		{
			System.out.println("divide by zero exception");
		}
		finally
		{
			System.out.println("Always execute");
		}
		

	}

}