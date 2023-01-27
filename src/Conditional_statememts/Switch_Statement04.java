package Conditional_statememts;

public class Switch_Statement04 {
	public static void main(String[] args) {
		String mobile="iphone";
		switch(mobile) {
		case "Samsung" :{
			System.out.println("Buy a Samsung phone");
			break;
		}
		case "iphone" :{
			System.out.println("Buy a iphone");
			break;
		}
		case "Oneplus" :{
			System.out.println("Buy a Onepluse");
			break;
		}
		case "Oppo" :{
			System.out.println("Buy a Oppo");
			break;
		}
		default:{
			System.out.println("Nothing to buy");
		}
		}
	}

}
