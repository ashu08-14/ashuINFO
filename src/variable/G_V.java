package variable;

public class G_V {
	int i=20;//non static global variable
	static int h=60;//static global variable
	public static void main(String[] args) {
		G_V g=new G_V();//object creation
		System.out.println(g.i);
		System.out.println(h);
	}

}
