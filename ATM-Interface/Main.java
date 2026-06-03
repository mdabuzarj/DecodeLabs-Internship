import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        sc = new Scanner(System.in);
    }

    public void displayMenu() {

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next();
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }

    private void checkBalance() {
        System.out.println("Current Balance: ₹" + account.getBalance());
    }

    private void depositMoney() {

        System.out.print("Enter deposit amount: ");

        while (!sc.hasNextDouble()) {
            System.out.println("Enter a valid amount!");
            sc.next();
        }

        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    private void withdrawMoney() {

        System.out.print("Enter withdrawal amount: ");

        while (!sc.hasNextDouble()) {
            System.out.println("Enter a valid amount!");
            sc.next();
        }

        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}
