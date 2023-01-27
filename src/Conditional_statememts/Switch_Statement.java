package Conditional_statememts;

public class Switch_Statement {
	public static void main(String[] args) {
		switch("Idli") {//output of expression
		case  "Idli" :{
			System.out.println("on monday");
			break;//JVM stop execution
		}
		case "Dosa" :{
			System.out.println("on Tuesday");
			break;
		}
		case "Uttapa" :{
			System.out.println("on Wednesday");
			break;
		}
		case "Wada" :{
			System.out.println("on Thursday");
			break;
		}
		case "Poha" :{
			System.out.println("on friday");
			break;
		}
		case "Rava" :{
			System.out.println("on Saturday");
			break;
		}
		default:{
			System.out.println("No chutany");
		}
		}
	
	}

}
