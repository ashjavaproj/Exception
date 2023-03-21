package PDF2_onTryNdCatchNdFinally_19_01_23;

public class Task6 {

	public static void main(String[] args) {
        try{
		int i=10/0;
		System.out.println(i);
          }
        catch(ArithmeticException e)
        {
        		System.out.println("catch block");
		try{
			String s=null;
			System.out.println(s.length());
          		}
        		finally{
            		System.out.println("finally block");
            	}
         }
     }
}
