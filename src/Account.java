import java.util.Scanner;

public class Account {

	//Class variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	//Class constructor
	Account(String cname, String cid){
		customerName = cname;
		customerID = cid;
	}
	
	//Function for depositing money from bank account
	void deposit (int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
		
    //Function for withdrawing money from bank account
		void withdraw (int amount) {
			if(amount != 0) {
				balance = balance - amount;
				previousTransaction = -amount;
			}
		}
		
	//Function showing the previous transaction
		void getPreviousTransaction() {
			if(previousTransaction > 0) {
				System.out.println("Deposited: " + previousTransaction);
			
			}else if (previousTransaction < 0) {
				System.out.println("Withdrawn: " + Math.abs(previousTransaction));
			}else {
				System.out.println("No transaction occurred");
			}
		}
		
		//Function calculating interest if current finds after a number of years
		void calculateInterest(int years) {
			double interestRate = 0.1;
			double newbalance = (balance * interestRate * years) + balance;
			System.out.println("After " + years + "years, the balance received will be " + newbalance);
		}
		//Function showing the main menu
			void showMenu() {
				char option = '\0';
				Scanner scanner = new Scanner(System.in);
				System.out.println("Welcome " + customerName + "!");
				System.out.println();
				System.out.println("What would you like to do?");
				System.out.println();
				System.out.println("A. Check your balance");
				System.out.println("B. Make a deposit");
				System.out.println("C. Make a withdrawal");
				System.out.println("D. View previous transaction");
				System.out.println("E. Calculate interest");
				System.out.println("F.Exit");
			
				do {
					System.out.println();
				    System.out.println("Enter an option: ");
				    char option1 = scanner.next().charAt(0);
				    option = Character.toUpperCase(option1);
				    System.out.println();
				    
				    switch(option) {
				    //Case A allows the user to check account balance
				    case 'A':
				    	System.out.println("========================");
				    	System.out.println("Balance = £" + balance);
				    	System.out.println("========================");
				    	System.out.println();
				    
				    //Case B allows the users to deposit money from their bank accounts
				    case 'B':
				    	System.out.println("Enter an amount to deposit: ");
				    	int amount = scanner.nextInt();
				    	deposit(amount);
				    	System.out.println();
				    	break;
				    	
				    //Case C allows the users to withdraw from their bank accounts
				    case 'C':
				    	System.out.println("Enter an amount to withdraw: ");
				    	int amount2 = scanner.nextInt();
				    	withdraw(amount2);
				    	System.out.println();
				    	break;
				    	
				    //Case D allows the users to view bank transactions
				    case 'D': 
				    	System.out.println("===========================");
				    	getPreviousTransaction();
				    	System.out.println("===========================");
				    	System.out.println();
				    	break;
				    	
				    case 'E':
				    	System.out.println(" Enter how many years of accrued interest:  ");
				    	int years = scanner.nextInt();
				    	calculateInterest(years);
				    	break;
				    	
				    //Case F exits the users from the bank account
				    case 'F':
				    	System.out.println("=============================");
				    	break;
				    	
				    	default:
				    		System.out.println("Error: Invalid option. Enter options: A,B,C,D,E");
				    		break;
				    }
				}
				    
				    while(option != 'F');
				    System.out.println("Thank you for banking with Demehin Banking Group");
				
			}
}



