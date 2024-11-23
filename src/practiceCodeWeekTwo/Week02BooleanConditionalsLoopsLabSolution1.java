package practiceCodeWeekTwo;

public class Week02BooleanConditionalsLoopsLabSolution1 {

	public static void main(String[] args) {

		
		/* 11. Write a for loop that prints each number from 10 to 0 backwards
		System.out.println("\nQuestion 11:");
		for (int i = 10; i >= 0; i--) {
			//System.out.println(i);
		}
		
		 12. Write a for loop that prints every other number from 0 to 100
		System.out.println("\nQuestion 12:");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// 13. Write a for loop that iterates from 0 to 100 and prints 
		//			"EVEN" if the number is even and "ODD" if it's odd
		//		Note:  This solution also prints the number.
		System.out.println("\nQuestion 13:");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " EVEN");
			} else {
				System.out.println(i + " ODD");
			}
		}*/
		
		// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//			within the loop, do the following:
		//				a. print the number and then divide each number by 3 and print the remainder to the console.
		System.out.println("\nQuestion 14:");
		int i = 100;
		while (i > 0) {
			System.out.println(i + " " + (i % 3));
			i--;
		}

		
		
	}
}
			

		




