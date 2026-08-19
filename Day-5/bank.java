import java.util.Scanner;

class detail {
    private String account_holder_name;
    private int balance;

    detail(String account_holder_name, int balance) {
        this.account_holder_name = account_holder_name;

        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getaccount_holder_name() {
        return account_holder_name;
    }

    public int getbalance() {
        return balance;
    }

    void withraw() {
        System.out.println("Enter the amount you wanted to withdraw:");

        Scanner scn = new Scanner(System.in);
        int withdraw = scn.nextInt();

        balance = balance - withdraw;

        System.out.println("Amount left: " + balance);
    }

    void deposit() {
        System.out.println("Enter the amount you wanted to deposit:");

        Scanner scn = new Scanner(System.in);
        int deposit = scn.nextInt();

        balance = balance + deposit;

        System.out.println("Available balance: " + balance);
    }
}

class bank {
    public static void main(String[] args) {

        detail s1 = new detail("Aditya", 5000);

        System.out.println(s1.getaccount_holder_name());
        System.out.println(s1.getbalance());

        s1.withraw();
        s1.deposit();

        System.out.println("Final Balance: " + s1.getbalance());
    }
}