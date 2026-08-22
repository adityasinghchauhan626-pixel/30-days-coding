import java.util.Scanner;
class searching{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number n :");
        int n = scn.nextInt();

        int []arr = new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();

        }
        System.out.println("Enter the element which you want to find ");
        int target = scn.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]== target){
                System.out.println("Elements is found " + target+ " at index "+i );
                break;
            }
            else{
                System.out.println("Elements are not found  at index " + i);
            }

        
        }
        

        scn.close();

        
    }
}