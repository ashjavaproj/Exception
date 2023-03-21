package PDF1_onSimpleTryNdCatch_16_01_23;

//WAP to handle NullPointerException through Exception . it's a super parent class of all exceptions

public class Task4 {

	public static void main(String[] args) {
		Task4 a=null;
		System.out.println("main__________start");
		try{
			System.out.println("Try------------start");
			System.out.println(a.toString());
			System.out.println("Try--------------End");
		}
		catch(Exception e)
		{
			System.out.println("catch block");
		}
		System.out.println("main___________end");
		}
	}
