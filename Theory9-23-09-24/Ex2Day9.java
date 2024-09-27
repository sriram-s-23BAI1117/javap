import java.util.Scanner;

public class Ex2Day9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] height = new int[len];
        for (int i=0;i<len;i++){
            height[i] = input.nextInt();
        }
        int mh = height[0];
        int count = 1;
        for (int i=1;i<len;i++){
            if (height[i]>mh){
                mh=height[i];
                count = count+1;
            }
        }
        System.out.println(count);
        input.close();
    }
}
