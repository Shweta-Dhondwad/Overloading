package Overloading;

public class Test 	{
	public static void main(String arg[])
	{
	System.out.println("Statement 1");
	try
	{
	System.out.println(10.2/0);
	}
	catch (Exception e)
	{
		e.printStackTrace();
	System.out.println(10/2);
	}
	System.out.println("Statement 2");
	}
	}


