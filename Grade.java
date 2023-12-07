import java.util.Scanner;

public class Grade {
    public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("put the letter grade =");

	String l = sc.next();

	switch (l) {
		case ("A"):
			System.out.println("GPA : 4.0" );
			break;
		case ("B"):
			System.out.println("GPA : 3.0" );
			break;
		case ("C"):
			System.out.println("GPA : 2.0" );
			break;
		case ("D"):
			System.out.println("GPA : 1.0" );
			break;
		case ("E"):
			System.out.println("GPA : 0.0" );
			break;
		default :
			System.out.println("invalid grade");	
			
			}
	}}
								