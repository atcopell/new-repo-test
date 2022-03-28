import java.util.Scanner;
public class Calculator {
	public static void main (String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter in two whole numbers.");
		int wholeNumberOne = scanner.nextInt();
		int wholeNumberTwo = scanner.nextInt();
		System.out.println(wholeNumberOne  + wholeNumberTwo);
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Would you like to add or subtract the two numbers?");
		String operationOne = scanner.nextLine();
		if (operationOne == "add") {
			System.out.print(wholeNumberOne + wholeNumberTwo);
		} else if (operationOne == "subtract") {
			System.out.print(wholeNumberOne - wholeNumberTwo);
		}
			
	}
	
}
