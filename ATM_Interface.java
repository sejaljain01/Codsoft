import java.util.Scanner;
public class ATMInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static double accountBalance = 1000.0; // Initial account balance
    public static void main(String[] args) {
        while (true) {
            System.out.println("ATM Interface");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    private static void checkBalance() {
        System.out.println("Your account balance: $" + accountBalance);
    }
    private static void deposit() {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit successful. Your new balance: $" + accountBalance);
        } else {
            System.out.println("Invalid amount. Please enter a positive amount.");
        }
    }
    private static void withdraw() {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Your new balance: $" + accountBalance);
        } else {
            System.out.println("Invalid amount or insufficient balance. Please try again.");
        }
    }
} 
