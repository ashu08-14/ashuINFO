package This_Keywords;

public class This {
	int a=10; //global variable
	public void test() {
		int b=20; // local variable
		System.out.println(b);
		//now i want to print global variable for same class
		System.out.println(this.a);
	}

}
