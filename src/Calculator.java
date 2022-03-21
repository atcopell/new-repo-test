import java.util.Scanner;
public class Calculator {
	public static void main (String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter in two whole numbers.");
		int wholeNumberOne = scanner.nextInt();
		int wholeNumberTwo = scanner.nextInt();
		System.out.print(wholeNumberOne  + wholeNumberTwo);
	}
	
}
