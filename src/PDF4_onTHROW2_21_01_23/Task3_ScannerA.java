package PDF4_onTHROW2_21_01_23;

import java.util.Scanner;

public class Task3_ScannerA {
	public void div(int a, int b){
		if(b==0){
			throw new ArithmeticException("Not use Input value of B is Zero");
		}
		else{
			int c = a/b;
			System.out.println("Value of c is: " +c);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A: ");
		int a = sc.nextInt();
		System.out.println("Enter value of B: ");
		int b = sc.nextInt();
		Task3_ScannerA s=new Task3_ScannerA();
		try {
			s.div(a, b);
		}
		catch(ArithmeticException e) {
		System.out.println("catch: "+e.getMessage());
		}
  	}
}


