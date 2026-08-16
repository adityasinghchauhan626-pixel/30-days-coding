import java.util.Scanner;

class prime{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number :");

        int a = scn.nextInt();


        int count=0;
        for(int i=1;i<=a;i++){

            if(a%i==0){
                count++;
            }
        }

        if(count==2){

            System.out.println("Prime number");
        }

        else{
            System.out.println("not a prime number :");
        }

        scn.close();
    }
}
