package Star_Pattern;

public class Left_Triangle {
public static void main(String[] args) {
	int i, j;
	int rows=5;
	//System.out.println("The number of rows is defined as " +rows);
	 //System.out.println("The left triangle star pattern : ");
	 
	    for(i=0; i<rows; i++) { //outer loop for rows
	    	
		  for(j=0; j<=i; j++) { //inner loop for columns
			
			//print stars
			System.out.print("* ");
			
		}
		System.out.println();
	    }
    }
}
