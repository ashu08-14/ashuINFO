package Conditional_statememts;

public class Switch_Statement03 {
public static void main(String[] args) {
	char grade='C';
	switch(grade) {
	case 'A' :{
		System.out.println("Well Done");
		break;
	}
	case 'B' :{
		System.out.println("Exllent");
		break;
	}
	case 'C' :{
		System.out.println("You Passed");
		break;
	}
	case 'D' :{
		System.out.println("Better try next time");
		break;
	}
	default:{
		System.out.println("invalid grade");
	}
	}
}
}
