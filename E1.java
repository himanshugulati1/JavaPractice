package exceptionhandling;

public class BasicTryCatch {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c;
		try
		{
			c=a/b;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero exception");
			
		}
		