import java.util.Scanner;

class bankaccount {
    String name;
    int account_no;
    double balance;

    void display() {
        System.out.println("Name of account holder " + name);
        System.out.println("Account no is " + account_no);
        System.out.println("Account balance is " + balance);
    }

    void withdraw() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the amount you want to withdraw");
        double n = scn.nextDouble();

        if (n <= balance) {
            balance = balance - n;
            System.out.println("Available balance is: " + balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    void deposit() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the amount you want to deposit:");

        double d = scn.nextDouble();

        balance = balance + d;
        System.out.println("Available balance is: " + balance);
    }
}

class saving_account extends bankaccount {
    double interest_rate;

    void calculate_interest() {

        double interest = (interest_rate * balance) / 100;

        System.out.println("Interest is " + interest);
    }
}

class current_account extends bankaccount {
    double overdraft;
    double amount_utilised;
    double annual_interest;

    void display_overdraft() {

        System.out.println("Overdraft limit is " + overdraft);

        double daily_interest =
                (amount_utilised * annual_interest) / 36500;

        System.out.println("Daily interest is " + daily_interest);
    }
}

class bank {
    public static void main(String[] args) {

        saving_account s1 = new saving_account();
        current_account c1 = new current_account();

        s1.name = "Aditya";
        s1.account_no = 43376;
        s1.balance = 567000;
        s1.interest_rate = 5;

        s1.display();
        s1.withdraw();
        s1.deposit();
        s1.calculate_interest();


        c1.name = "Aman";
        c1.account_no = 8868967;
        c1.balance = 88877000;
        c1.overdraft = 50000;
        c1.amount_utilised = 10000;
        c1.annual_interest = 12;

        c1.display();
        c1.withdraw();
        c1.deposit();
        c1.display_overdraft();
    }
}