package practiceCodeWeekTwo;

import java.util.Scanner; // Import statements go outside the class

public class DustinPractice {

	// Method to calculate the sum of three integers
	public static int returnSum(int num1, int num2, int num3) {
		return num1 + num2 + num3; // Add the three numbers and return the sum
	}

	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3;

		// Read three integers from the user
		System.out.println("Enter three integers:");
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();

		// Call the returnSum method and print the result
		System.out.println("The sum is: " + returnSum(num1, num2, num3));
	}
}









		

