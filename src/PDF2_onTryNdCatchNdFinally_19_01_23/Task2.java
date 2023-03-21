package PDF2_onTryNdCatchNdFinally_19_01_23;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("Main --------------Start");
		try{
			System.out.println("try___________start");
			int i=Integer.parseInt("12,3");
			System.out.println(i);
			System.out.println("try___________end");
		}
		catch(NumberFormatException e){
			System.out.println("catch block");
		}
		finally{
			System.out.println("finally block");
		}
		System.out.println("Main --------------End");
	}
}

