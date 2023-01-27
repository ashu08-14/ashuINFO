package Methods;

public class Static_method_call_from_same_class {//class body open
	public static void main(String[] args) {// main method body open
	//we are calling static regular method from same class
		
	recharge();	
	electricity();
	moneyTransfer();
	
	
	}//main method close
	public static void moneyTransfer() {// m1 block is open(regular method 1)
		System.out.println("money transfer is succesfull");
		System.out.println("money transfer is not succesfull");
		
		
	}//m1 block close
	public static void recharge() {//regular method 2
		System.out.println("recharge succesfull");
		System.out.println("recharge not succesfull");
		
	}//m2 block close
	public static void electricity() {//regular method 3
		System.out.println("Bill is paid");
		System.out.println("AC bill is paid");
		System.out.println("Cooler bill unpaid");
		
	}//m3 block close
		
	}//class body close


