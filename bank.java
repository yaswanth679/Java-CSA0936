import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;

   
    public BankAccount(String accountNumber, String accountHolderName, String accountType, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (isValidAccountType(accountType)) {
            this.accountType = accountType;
        } else {
            System.out.println("Invalid account type. Setting to default: Savings.");
            this.accountType = "Savings"; 
        }
        this.balance = initialBalance;
    }

    private static boolean isValidAccountType(String type) {
        return type.equals("Savings") || type.equals("Withdrawal") || type.equals("Current");
    }

   
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Depositor Name: " + accountHolderName);
        System.out.println("Type of Account: " + accountType);
        System.out.println("Balance: " + balance);
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter depositor name:");
        String depositorName = scanner.nextLine();

        System.out.println("Enter type of account (Savings, Withdrawal, Current):");
        String accountType = scanner.nextLine();

       
        if (!isValidAccountType(accountType)) {
            System.out.println("Invalid account type. Setting to default: Savings.");
            accountType = "Savings"; // Set default account type to Savings
        }

        System.out.println("Enter initial balance:");
        double initialBalance = scanner.nextDouble();

       
        BankAccount account = new BankAccount(accountNumber, depositorName, accountType, initialBalance);

       
        System.out.println("\nAccount Information:");
        account.displayAccountInfo();

        scanner.close();
    }
}
