/* 1.Write a program to check whether a number is a Strong number or not. 
Strong number is a special number whose sum of factorial of digits is equal to the original number.
For example: 145 is a strong number. Since, 1! + 4! + 5! = 145 
[Hint: conditional operator,method,use parameterized method to take input] Sample Input 1: 145
*/


package Demo;

import java.util.Scanner;

public class StrongNumber {

	// Method to calculate factorial of a digit
	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	// Parameterized method to check if a number is Strong
	public static boolean isStrong(int num) {
		int sum = 0, temp = num;
		while (temp != 0) {
			int digit = temp % 10;
			sum += factorial(digit);
			temp /= 10;
		}
		return sum == num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		// Using conditional operator to print result
		System.out.println(number + " is " + (isStrong(number) ? "a Strong number" : "not a Strong number"));


	}

}


/*  OUTPUT : 
 
 Enter a number: 145
145 is a Strong number
  */
 
	
	
