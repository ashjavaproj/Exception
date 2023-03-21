package PDF2_onTryNdCatchNdFinally_19_01_23;

public class Task5 {

	public static void main(String[] args) {
		System.out.println("Main------------Start");
 		try{
    			System.out.println("Try____Start");
    			int i=45/0;
    			System.out.println(i);
		 }
 		catch(ArrayIndexOutOfBoundsException e){
    			System.out.println("Catch _________Block");
		 }
 		finally{
    			System.out.println("finally block");
 		}
 		System.out.println("Main------------End");
	 }
}
