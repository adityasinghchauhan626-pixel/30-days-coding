import java.util.Scanner;
class minarr{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scn.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the value of n ");
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();

        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];

            }

        }
        System.out.println("Minimun term is " + min);
        scn.close();
    }
}