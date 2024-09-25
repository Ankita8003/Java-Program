public class Bank {
    // Instance variable to hold the account amount
    private double amount;

    // Parameterized constructor to initialize amount
    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    // Method to withdraw money
    public void withdraw(double withdrawalAmount) {
        // Using ternary operator to check if amount is sufficient
        String message = (withdrawalAmount <= amount) ? 
                         "Withdraw successful" : 
                         "Insufficient funds";
        
        // If sufficient, update the amount
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
        
        // Print the message
        System.out.println(message);
    }

    // Method to deposit money
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    // Method to display the total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    // Main method to test the Bank class
    public static void main(String[] args) {
        // Create a Bank instance with an initial amount of 10000
        Bank bankAccount = new Bank(10000);

        // Withdraw some amount
        bankAccount.withdraw(3000);
        
        // Deposit amount
        bankAccount.deposit(5000);
        
        // Display the total balance
        bankAccount.displayBalance();
    }
}
