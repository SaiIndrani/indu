
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
	System.out.println("Enter x");
	int x=s.nextInt();
	if(x>0)
	{
		System.out.println("x is Positive");
	}
	else if(x<0)
	{
	System.out.println("x is Negative");
	}
	else 
	{
	System.out.println("x is zero");
	}
	}
}