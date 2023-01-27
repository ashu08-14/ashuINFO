package Conditional_statememts;

public class If_else_ladder {
	public static void main(String[] args) {
		int i=100;
		if(i>=70) {
			System.out.println("pass with distinction");
		}
		else if(i>=55) {
			System.out.println("pass with 1st class");
		}
	
	    else if(i>=45) {
		System.out.println("pass with 2nd class");
	}
	    else if(i>=35) {
	    	System.out.println("pass");
	    }
	    else {
	    	System.out.println("fail");
	    }
		

}
}