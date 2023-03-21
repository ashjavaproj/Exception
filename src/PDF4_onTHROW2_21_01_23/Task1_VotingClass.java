package PDF4_onTHROW2_21_01_23;

//Complete the code without handling exception and write the output of the program.

public class Task1_VotingClass {

	public void voting(int age){  
		if(age<18){
			throw new ArithmeticException("Not Eligible for vote");
		}
		else{  
			System.out.println("Welcome to vote");
		}
	}  
	public static void main(String args[]){  
		Task1_VotingClass v=new Task1_VotingClass();
		try{
			v.voting(13);
		}
		catch(ArithmeticException e){
			System.out.println("catch: "+e.getMessage());
		//	e.printStackTrace();
			//System.out.println("catch: "+e.getCause());
		}
	}  
}

