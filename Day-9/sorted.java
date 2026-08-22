import java.util.Scanner;
class sorted{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scn.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the elements ");
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int count =0;
        for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                count++;

            }
        }

        if(count>0){
            System.out.println("Array is not sorted :");
        }
        else{
            System.out.println("Array is  sorted :");
        }
        scn.close();
    }
}