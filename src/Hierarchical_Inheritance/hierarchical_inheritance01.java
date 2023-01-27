package Hierarchical_Inheritance;


public class hierarchical_inheritance01{ //ULC
public static void main(String[] args) {
	son1 a=new son1();// object 1
	a.bike();
	a.car();
	a.home();
	a.job();
	a.money();
	System.out.println("properties of son1");
	System.out.println("s1");
	
	son2 b=new son2();// object 2
	b.mobile();
	b.car();
	b.home();
	b.job();
	b.money();
	System.out.println("properties of son2");
	System.out.println("s2");
	
	son3 c=new son3();
	c.car();
	c.home();
	c.job();
	c.money();
	c.horse();
	System.out.println("properties of son3");
	System.out.println("s3");
}

    

}



