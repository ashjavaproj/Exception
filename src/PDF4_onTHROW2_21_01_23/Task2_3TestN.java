package PDF4_onTHROW2_21_01_23;

public class Task2_3TestN {
	public static void main(String[] args){
		Task2_2Number num = new Task2_2Number();
	    try{
	      num.getNumber(0);
	    }
	    catch (Task2_1ZeroInputException e){
	      System.out.println("catch: "+e.getMessage());
	    }
	  }
}

