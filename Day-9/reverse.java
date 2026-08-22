import java.util.Scanner;
class reverse{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println("Elements are :");
            System.out.println(arr[i]);
        }
        scn.close();
    }
}