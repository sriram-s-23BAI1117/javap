//pair sum
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the required sum: ");
        int sum = input.nextInt();
        System.out.print("Pairs of elements having the required sum: ");
        for (int i=0;i<n;i++){
            int k = sum-arr[i];
            for (int j=i+1;j<n;j++){
                if (k==arr[j]){
                    System.out.print("("+arr[i]+","+arr[j]+")"+" ");
                }
            }
        }
        input.close();
    }
}


