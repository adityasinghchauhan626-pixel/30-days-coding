import java.util.Scanner;

class factorail{


    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);

       System.out.println("Enter the number:");

       int a = scn.nextInt();

       int fact=1;

       for(int i =1;i<=a;i++){

        fact = fact*i;



       }

       scn.close();

       System.out.println("Factorail of given number is " +fact);

    }
}