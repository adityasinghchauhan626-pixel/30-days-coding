import java.util.Scanner;
class maxarr{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       // int []arr = new int[n];
        System.out.println("Enter the number n ");
        int n = scn.nextInt();
         int []arr = new int[n];
         System.out.println("Enter the number of element ");

        for(int i =0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Maximum element is "+max);
        scn.close(); 

    }
}