import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int num = (n1>n2)? n1:n2;
        while (true){
            if (num%n1==0 && num%n2==0){
                break;
            }
            num++;
        }
        input.close();
        System.out.printf("The LCM of %d and %d is %d",n1,n2,num);
    }
}
