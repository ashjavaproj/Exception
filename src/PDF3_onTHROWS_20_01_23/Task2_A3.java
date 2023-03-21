package PDF3_onTHROWS_20_01_23;

public class Task2_A3 {
	public void m1() {
		System.out.println("m1________A3_____Start");
		Task2_B3 b=new Task2_B3();
		b.m2();
		System.out.println("m1_______A3____End");
	}
	public static void main(String[] args){
		System.out.println("main _________start");
		Task2_A3 a=new Task2_A3();
		//handle Exception here.
			a.m1();
		System.out.println("main __________End");
	}
}
