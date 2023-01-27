package Arrays;

public class SingleDi {
	public static void main(String[] args) {
		String ar[]=new String[4];
		ar[0]="Ashwini";
		ar[1]="Ashrika";
		ar[2]="Gaurav";
		ar[3]="Piyush";
		ar[4]="Kirkte"; //AIOOBE
		System.out.println(ar[0]);   //.charAt(0) then we get SIOOBE
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		

		System.out.println(ar[4]); // there is no data but still we are trying to fetch so we will get AIOOBE
		
	}

}
