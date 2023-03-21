package PDF3_onTHROWS_20_01_23;

public class Task1_A3 {
	
	public void m1()throws Exception{
		System.out.println("m1________A3_____Start");
		Task1_B3 b=new Task1_B3();
	
		b.m2();
		
		System.out.println("m1_______A3____End");
	}
	public static void main(String[] args){
		System.out.println("main _________start");
		Task1_A3 a=new Task1_A3();		
		try {
		
			a.m1();
		}
		catch(Exception e) {
			System.out.println(" Catch block ");
		}
		System.out.println("main __________End");
	}
}


		


