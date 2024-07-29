import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        for (int i=a;i<=b;i++){
            int k=0,num=i,sum=0;
            while (num>0){
                k=num%10;
                sum+=k*k*k;
                num=num/10;
            }
            if (sum==i){
                System.out.println(i+" is an Armstrong number.");
            }
        }
        input.close();
    }
}