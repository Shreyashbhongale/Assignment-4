import java.util.Scanner;

class Movie {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		double t = 0.0;
		System.out.println("Put Age = ");
		double a = sc.nextDouble();

		System.out.println("put time = ");
		 t = sc.nextDouble();
		
		if ( a <= 12 ) {
			t = 5.00;
		} else if ( a >=12 &&  a < 60) {
			t = 10.00;
		} else {
			t = 7.50;
		}
		if ( t > 15 && t<18) {
			t = t - 2.00;
		}
		if ( t>18) {
			t = t - 3.00;
		}
			System.out.println("ticket price = " + t);

		}}