import java.util.Scanner;

class vote{

    static void vo(){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the age :");

        int n = scn.nextInt();

        if(n>18){

            System.out.println("person is eligible to vote ");
        }

        else{

            System.out.println("person is not eligible to vote :");
        }

        scn.close();





    }

    public static void main(String[] args) {
        vo();
    }
}