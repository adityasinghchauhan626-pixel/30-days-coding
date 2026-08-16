import java.util.Scanner;

class evenodd{

    static void check( ){

        Scanner scn = new Scanner(System.in);

        System.out.println(("Enter the number:"));

        int n = scn.nextInt();


        if(n%2==0){

            System.out.println("number is even:");
        }

        else{
            System.out.println("number is odd:");
        }

        scn.close();


    }


    public static void main(String[] args) {

        check();
        
    }
}