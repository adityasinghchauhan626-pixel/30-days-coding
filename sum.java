import java.util.Scanner;

class sum{

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number n :");


        int a = scn.nextInt();


        int sum =0;


        for(int i =1;i<=a;i++){

            sum = sum+i;

            System.out.println("sum "+sum);


        }

        scn.close();

    }
}