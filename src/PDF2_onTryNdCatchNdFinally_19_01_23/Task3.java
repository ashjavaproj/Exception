package PDF2_onTryNdCatchNdFinally_19_01_23;

public class Task3 {

	public static void main(String[] args) {
		try{
			String s=null;
			System.out.println(s.length());
		}
		 catch(NullPointerException e)
		{
	        	System.out.println("catch block");
	        }
	}
}
