import java.util.Scanner;

class positive_negative{

    static void check(){

        Scanner scn = new Scanner(System.in);


        System.out.println("Enter the number :");

        int n = scn.nextInt();

        if(n<0){

            System.out.println("number is negative ;");
        }

        else if(n>0){

            System.out.println("number is positive:");
        }

        else if (n==0){

            System.out.println("number is zero :");
        }
        scn.close();



    }


    public static void main(String[] args) {
        check();
    }
}
