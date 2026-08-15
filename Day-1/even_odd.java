import java.util.Scanner;

class even_odd{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);



        System.out.println("Enter the number n :");

        int a = scn.nextInt();

        if(a%2==0){

            System.out.println("Given number is a even:" +a);
        }


        else{

            System.out.println("Given number is odd"+a);
        }

        scn.close();
    }
}