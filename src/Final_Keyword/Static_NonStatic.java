package Final_Keyword;

public class Static_NonStatic {
	 static int a=10;
	int b=30;
	public static void main(String[] args) {
		//object1
		Static_NonStatic ref=new Static_NonStatic();
		System.out.println(ref); //it will print the object1
		//object2
		Static_NonStatic ref01=new Static_NonStatic();
		System.out.println(ref01);
	}

}
