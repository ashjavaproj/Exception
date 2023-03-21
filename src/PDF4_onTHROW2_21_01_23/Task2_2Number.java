package PDF4_onTHROW2_21_01_23;

public class Task2_2Number {

	public void getNumber(int i) throws Task2_1ZeroInputException{
	    if (i == 0){
	    	Task2_1ZeroInputException e=new Task2_1ZeroInputException("Zero input number .....");
	    	throw e;
	    }
	}
}
