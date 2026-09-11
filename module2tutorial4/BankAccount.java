package module2;
import java.util.Scanner;

class BankAccount
{
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int number, String holder, double bal)
    {
        accountNumber = number;
        accountHolder = holder;
        balance = bal;
    }

    void deposit(double amount)
    {
        balance = balance + amount;
    }

    void displayDetails()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();

        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();

        BankAccount b = new BankAccount(number, holder, bal);

        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();

        b.deposit(amount);

        System.out.println("\nUpdated Account Details:");
        b.displayDetails();
    }
}
