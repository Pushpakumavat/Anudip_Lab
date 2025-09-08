/* 2. Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator. 
Sample Input: num1 = 10 num2 = 30
*/

package Demo;

public class Maximum_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 30;
		int max = (num1 > num2) ? num1 : num2;
		
		System.out.println("Maximum Number is: " + max);
		
		

	}

}


/* ouput : 
 
  Maximum Number is: 30 */
