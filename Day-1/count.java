import java .util.Scanner;

class count{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.println("Enter the number :");

        int a = scn.nextInt();

        int count =0;


        for(;a!=0;a=a/10){

            count++;
        }

        System.out.println(count);

        scn.close();
    }
}