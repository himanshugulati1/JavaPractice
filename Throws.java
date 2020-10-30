package exceptionhandling;
import java.util.Scanner;
class abc
{   void divide() throws ArithmeticException 
	{   Scanner sc=new Scanner(System.in);
		System.out.println("please enter the value of a");
		int a=sc.nextInt();
		System.out.println("please enter the vaslue of b");
		int b=sc.nextInt();
		int c=a/b;
	    System.out.println("the value of c is :"+c);
	     try {
	    	 if(b==0)
	    	 {
	    	  c=a/b;
	    	 }
	    }
	    catch(Exception e){
	    	System.out.println("divide by zero exception");
	    }
	    }}
public class ThrowsKeyword {

	public static void main(String[] args) {
		abc a=new abc();
		a.divide();
	}
}