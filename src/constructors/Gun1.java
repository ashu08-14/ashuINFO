package constructors;

public class Gun1 {//BLC
String gunName;
int noOfBullets;
//constructor
public Gun1(String gunName,int noOfBullets) {
	this.gunName="AK47";
	this.noOfBullets=8;
	
}
	//non static method
	public void shoot() {
		for(int i=1;i<=noOfBullets;i++) {
			System.out.println("dishkew");
		}			
}
}