package exceptionhandling;

public class NestedTryBlock {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c;
		int arr[]=new int[4];
		try
		{
			c=a/b;
			try
			{
				arr[5]=10;	
			}
			catch(Exception e)
			{
				System.out.println("array index out of bound");
				
			}
		}
		catch(Exception e)
		{
			System.out.println("divide by zero exception");
			
		}
		

	}

}