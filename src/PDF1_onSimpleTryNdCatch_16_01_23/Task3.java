package PDF1_onSimpleTryNdCatch_16_01_23;

//we try to handle NullPointerException through ArithmeticException 

public class Task3 {

	public static void main(String[] args) {
		
		Task3 a=null;
		
		System.out.println("main__________start");
		try{
			System.out.println("Try------------start");
			System.out.println(a.toString());//Exception java.lang.NullPointerException
			System.out.println("Try--------------End");
		}
		catch(ArithmeticException e)//we try to handle NullPointerException through ArithmeticException 
									//so NullPointerException not handle and  Exception occur
		{
			System.out.println("catch block");
		}
		System.out.println("main___________end");
		}
	}


