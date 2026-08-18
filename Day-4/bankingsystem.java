import java.util.Scanner;

class important{
    private String account;
    private double balance;

    public void setaccount(String account){
        this.account = account;

    }
    public void setbalance(double balance){
        this.balance = balance;

    }

    public String getaccount(){
        return account;
    }

    public double getbalance(){
        return balance;
    }
}
class bankingsystem{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        important s1 = new important();

        System.out.println("Enter the detail");
        String account1 = scn.nextLine();
        System.out.println("Enter the balance:");
        double balance1 = scn.nextInt();
        scn.nextLine();  
        
        important s2 = new important();

        System.out.println("Enter the detail ");
        String account2 = scn.nextLine();
        double balance2 = scn.nextInt();

        s1.setaccount(account1);
        s1.setbalance(balance1);
        s2.setaccount(account2);
        s2.setbalance(balance2);
        scn.close();
        if(s1.getbalance()<0){
            System.out.println("invalid");

        }
        else{
            System.out.println(s1.getaccount());
            System.out.println(s1.getbalance());

        }

        System.out.println(s2.getaccount());
        System.out.println(s2.getbalance());
        

    }
}