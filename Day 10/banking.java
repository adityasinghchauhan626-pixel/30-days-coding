import java.util.Scanner;


class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    double balance;


    BankAccount(double balance) {
        this.balance = balance;
    }

    
    void withdraw(double amount) throws InsufficientBalanceException {

        if ((balance - amount) < 1000) {
            throw new InsufficientBalanceException(
                    "Withdrawal Failed! Minimum balance should be ₹1000.");
        }

        balance = balance - amount;

        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance = ₹" + balance);
    }
}

public class banking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(10000);

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        try {

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        }

        sc.close();
    }
}
