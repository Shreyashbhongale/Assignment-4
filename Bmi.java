import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("put the weight = ");

		double w = sc.nextDouble();

		System.out.println("put the height = ");

		double h = sc.nextDouble();

		double bmi = w/(h*h);
		

		if ( bmi <= 18.5 ) {
			System.out.println("Underweight");
		}
		else if ( bmi <= 18.5 && bmi>= 25) {
			System.out.println("Normal");
		}
		else if (bmi <= 25 && bmi>= 30 ) {
			System.out.println("overweight");
		} else {
			System.out.println("obese");
		}
			 }   } 
			