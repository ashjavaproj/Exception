package PDF1_onSimpleTryNdCatch_16_01_23;


//WAP for NullPointerException
public class Task1{
	
public static void main(String[] args) {
	System.out.println("main__________start");
	
		Task1 a=null;
		System.out.println(a.toString());//		Exception in thread "main" java.lang.NullPointerException    
		System.out.println("main___________end");
	}
}
