import java.util.Scanner;
class count{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scn.nextInt();
        System.out.println("Enter the " + n + "elements");
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = scn.nextInt();


        }
        int count_even =0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count_even++;
            }

        }
        System.out.println("Even elements are" +count_even);
        int count_odd = n-count_even;
        System.out.println("Odd elements are " + count_odd);
        scn.close();

    }
}