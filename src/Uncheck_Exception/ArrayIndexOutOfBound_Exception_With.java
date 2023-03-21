package Uncheck_Exception;


//ArrayIndexOutOfBound_Exception With try and catch block

public class ArrayIndexOutOfBound_Exception_With {

	public static void main(String[] args) {
		System.out.println("Main Start");
		int a[]=new int[2];
		a[0]=10;
		a[1]=20;
		try {
			System.out.println("Try Start");
			System.out.println(a[2]);
			System.out.println("Try End");
		}
		catch(Exception e)
		{
			System.out.println("Catch block");
		}
		System.out.println("Main END");

	}

}
