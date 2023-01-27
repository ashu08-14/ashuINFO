package variable;

public class NonStatic {
	int g=60;//non static global variable
	public static void main(String[] args) {
		NonStatic n=new NonStatic();
		System.out.println(n.g);
	}
	

}
