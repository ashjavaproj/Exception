package Uncheck_Exception;

    //Arithmetic Exception With try and catch block

public class Arithmetic_Exception_With {

public static void main(String[] args) {
System.out.println("Main start");
try {
	System.out.println("Try Start");
int a=10/0;
System.out.println("Try End");
}
catch(Exception e)
{
	System.out.println("Catch block");
}
System.out.println("Main End");
}	
}	



