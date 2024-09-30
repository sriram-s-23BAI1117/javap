//move 0's to the end
import java.util.Scanner;

public class Ex3_19_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Array with 0's moved to end: ");
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]==0){
                    arr[j] = arr[j+1];
                    arr[j+1] = 0;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}


