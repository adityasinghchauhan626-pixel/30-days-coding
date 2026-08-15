import java.util.Scanner;

class greatest_of_three{

    public static void main(String[] args) {
        

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the first number :");

        int a = scn.nextInt();

        System.out.println("Enter the second  number :");

        int b = scn.nextInt();
        

        System.out.println("Enter the third  number :");

        int c = scn.nextInt();



        if(a>b&&a>c){

            System.out.println("a is the greatest number : "+a);
        }

        else if (b>a&&b>c){


            System.out.println("b is the greatest number :" +b);


        }

        else{

            System.out.println("c is the greatestv number :" +c );
        }

        scn.close();
        

    }
}