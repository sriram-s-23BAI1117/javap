//Odd numbers at even index
import java.util.Scanner;

public class Ex1_19_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lenth of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Odd numbers at even index: ");
        for (int i=0;i<n;i+=2){
            if (arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        input.close();
    }
}


