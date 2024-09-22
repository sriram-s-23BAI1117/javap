import java.util.Scanner;

public class ChefClass{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=0;i<n;i++){
            int  week = input.nextInt();
            int coins = input.nextInt();
            System.out.println(week*coins);
        }
        input.close();
    }
}