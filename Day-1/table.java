import java.util.Scanner;

class table{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the number:");

        int a = scn.nextInt();

        for(int i=1;i<=a*10;i+=a){

            System.out.println(i);
        }

        scn.close();
    }
    
}