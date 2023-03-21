package PDF3_onTHROWS_20_01_23;

public class Task3_A4 {
	
		public void m1() {
			System.out.println("m1________A4___Start");
			Task3_B4 b=new Task3_B4();
			b.m2();
			System.out.println("m1_______A4____End");
		}
		public static void main(String[] args){
			System.out.println("main _________start");
			Task3_A4 a=new Task3_A4();
			//handle exception here
				a.m1();
			System.out.println("main __________End");
		}
	}
