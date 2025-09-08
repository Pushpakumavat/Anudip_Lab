/* 1.       Create a Bank class and declare an instance variable named amount of type double.

Create parameterized constructor to initialize variable “amount” with value 10000.Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).

Calculate withdrawal based on some condition (using ternary operator) like If amount is sufficient then “withdraw successful” message will be printed on the console and amount should be updated after withdraw. 
Later on, deposit 5000 in the account balance.At the end display total balance on the console. String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";

[Hint: Use constructor, ternary operator] Sample input: Amount=10000 Withdrawal amount=5000 Deposit amount=5000
 */

package Demo;

class Bank{
	double amount;

	Bank(double amount) {
		this.amount = amount;
	}




	void Withdraw(double WithdrawalAmount) {
		String message = (WithdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";

		System.out.println(message);

		amount = (WithdrawalAmount <= amount) ? (amount - WithdrawalAmount) : amount;
	}


	void Deposit(double DepositAmount) {

		amount += DepositAmount;

		System.out.println("Deposit Successfully : " +DepositAmount);


	}

	void DisplayBalance() {

		System.out.println("Total Balance : " +amount);


	}

}



public class Bank_Withdrawal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank B = new Bank(10000);

		B.Withdraw(5000);
		B.Deposit(5000);
		B.DisplayBalance();


	}

}





/* output :
Withdrawal successful
Deposit Successfully : 5000.0
Total Balance : 10000.0
 *
 */

