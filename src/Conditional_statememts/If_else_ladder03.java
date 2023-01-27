package Conditional_statememts;

public class If_else_ladder03 {
	public static void main(String[] args) {
		int x=10;
		if(x>=55) {
			System.out.println("55 is  eligible for vaccine");
		}
		else if(x>=40) {
			System.out.println("40 is eligible for vaccine");
		}
		else if(x>=30) {
			System.out.println("30 is eligible for vaccine ");
		}
		else if(x>=18) {
			System.out.println("18 is eligible for vaccine");
		}
		else {
			System.out.println("not eligible for vaccine");
		}
	}

}
