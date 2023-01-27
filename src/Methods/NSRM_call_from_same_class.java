package Methods;

public class NSRM_call_from_same_class {
	public static void main(String[] args) {
		 NSRM_call_from_same_class n=new  NSRM_call_from_same_class();
		 n.m3();
		 n.m4();
		
	}
	public void m3() {
		System.out.println("I am from NSRM m3");
		System.out.println("I am from Nashik");
		System.out.println("Dindori road");

}
	public void m4() {
		System.out.println("I am from NSRM m4");
		System.out.println("kala nagar");
		System.out.println("lane number 1");
	}
}