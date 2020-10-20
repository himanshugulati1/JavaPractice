package exceptionhandling;
import java.util.*;
import java.lang.*;

public class ArrayIndexOfBoundException {

	public static void main(String[] args) {
		int a[]=new int[5];
		try
		{
			for(int i=0;i<a.length+1;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound ");
			
		}



	}

}