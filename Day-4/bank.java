import java.util.Scanner;

class display{

    private String account;
    private int balance;

    public void setaccount(String account){
        this.account = account;

    }
    public void setbalance(int balance){
        this.balance = balance;

    }

    public String getaccount(){
        return account;
    }
    public int getbalance(){
        return balance;

    }
}
class bank{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        display s1 = new display();
        System.out.println("Enter the account holder name :");

        String account = scn.nextLine();

        System.out.println("Enter the balance :");


        int balance = scn.nextInt();

        s1.setaccount(account);
        s1.setbalance(balance);

        if(s1.getbalance()<0){
            System.out.println("Invalid");
        }

        else{
            System.out.println("Account holder name :" + s1.getaccount());


            System.out.println("Balance :" + s1.getbalance());
        }
        scn.close();

    }
}