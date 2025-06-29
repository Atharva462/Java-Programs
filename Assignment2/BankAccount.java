import java.util.Scanner;
public class BankAccount {
	String accountNumber;
	double balance;
	BankAccount(String ac){
		this.accountNumber = ac;
		this.balance = 0.0;
	}
	void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Succesfully Deposited: "+amount);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}
	void withdraw(double amount) {
		if(amount>0 && amount <= balance) {
			balance -= amount;
			System.out.println("Successfully Witdraw: "+amount);
		} else if(amount > balance){
			System.out.println("Insufficient funds for this withdrawal.");
		}else {
			System.out.println("Witdrawal amount must be positive");
		}
	}
	public double getBalance() {
		return balance;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number:");
		String accountNumber = sc.nextLine();
		BankAccount account = new BankAccount(accountNumber);
		
		while(true) {
			System.out.println("\nBank Account Menu:");
			System.out.println("1. Deposit:");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance Inquiry");
			System.out.println("4. Exit");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter amount to deposit: ");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
				break;
			case 2:
				System.out.println("Enter amount to witdraw: ");
				double withdrawAmount = sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 3:
				System.out.println("Current Balnace: "+account.getBalance());
				break;
			case 4:
				System.out.println("Existing the system. Thank you!");
				sc.close();
				return;
			default:
				System.out.println("Invalid option. Please try again.");
			}
			
		}
	}

}
