import java.util.Scanner;

public class Ex4_30_9 {
    public static void findMissingAndRepeating(int[] arr) {
        int n = arr.length;
        int repeating = -1;
        int missing = -1;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                repeating = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index]; 
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1; 
                break;
            }
        }

        System.out.println(repeating+" "+missing);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        findMissingAndRepeating(arr);
        scanner.close();
    }
}
