import java.util.Scanner;
public class sum_arr{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of elements in array");
        int n = scn.nextInt();
        int []arr = new int[n];
        System.out.println("__Enter the elements__");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();

            
        }
        for(int i=0;i<n;i++){
            sum = sum + arr[i];

        }
        System.out.println("Sum of the elements " +sum);
        scn.close();


    }
}