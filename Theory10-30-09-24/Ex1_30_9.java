import java.util.Scanner;
//consecutive increase
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
        int i=0;
        while (i<n-1){
            curc=0;
            while (i<n-1 && arr[i]<arr[i+1]){
                curc++;
                i++;
            }
            if (curc > maxc){
                maxc=curc;
            }
            i++;
        }
        System.out.println(maxc);
        input.close();
    }
}