package PDF2_onTryNdCatchNdFinally_19_01_23;

public class Task4 {

	public static void main(String[] args) {
		try{
			int i=10/0;
			System.out.println(i);
	        }
	        finally{
	        	System.out.println("finally block");
	        }
	        catch(ArithmeticException e)//error Compilation prblm
		{
	        	System.out.println("catch block");
	        }
	    }
	}
