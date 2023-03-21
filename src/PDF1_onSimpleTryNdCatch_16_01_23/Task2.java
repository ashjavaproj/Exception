package PDF1_onSimpleTryNdCatch_16_01_23;

//WAP to handle NullPointerException

public class Task2 {

	public static void main(String[] args) {
		Task2 a=null;
		System.out.println("main__________start");
		try{
			System.out.println("Try------------start");
			System.out.println(a.toString());
			System.out.println("Try--------------End");
		}
		catch(NullPointerException e){
			System.out.println("catch block");
		}
		System.out.println("main___________end");
		}
	}
