import java.util.Scanner;
class positive{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scn.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();

        }
        int positive =0;
        int negative =0;
        int zero =0;

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                positive++;

            }
        }
        System.out.println("Total positve " + positive);

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                negative++;
            }
        }
        System.out.println("Total negative " + negative);
        scn.close();
        zero = n-positive-negative;
        System.out.println("Total zeroes " + zero);

    }
}