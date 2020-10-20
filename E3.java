package exceptionhandling;



public class OneTryMultipleCatch {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c;
		try
		{
			c=a/b;
		}
		catch(NullPointerException ne)
		{
			System.out.println("yes it is a null pointer exception");	
		}
		catch( NumberFormatException fn)
		{
			System.out.println("yes it is a NumberFormatException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("yes it is a arthimatic exception");
		}
		finally
		{
			System.out.println("rest of code");
		}
		
	}

}