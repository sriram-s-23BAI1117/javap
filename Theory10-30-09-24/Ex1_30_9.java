import java.util.Scanner;

public class Ex1_30_9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int curc=0;
        int maxc=0;
        for (int i=1;i<n;i++){
            if (arr[i]>arr[i-1]){
                curc++;
            }
            if (curc>maxc) {maxc = curc; curc=0;}
        }
        System.out.println(maxc);
        input.close();
    }
}