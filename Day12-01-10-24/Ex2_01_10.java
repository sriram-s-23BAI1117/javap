import java.util.Scanner;

public class Ex2_01_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight = input.nextInt();
        int row = input.nextInt();
        int col = input.nextInt();
        int moves = input.nextInt();
        System.out.println(weight);
        if (moves<=6){
            if ((col+1)<=8){
                System.out.println((row)+","+(col+1));
            }
        }
        else{
            if ((row-1)>=1){
                System.out.println((row-1)+","+col);
            }
            if ((row+1)<=8){
                System.out.println((row+1)+","+col);
            }
            if ((col-1)>=1){
                System.out.println((row)+","+(col-1));
            }
            if ((col+1)<=8){
                System.out.println((row)+","+(col+1));
            }
            if ((row-1)>=1 && (col-1)>=1){
                System.out.println((row-1)+","+(col-1));
            }
            if ((row+1)<=8 && (col-1)>=1){
                System.out.println((row+1)+","+(col-1));
            }
            if ((row-1)>=1 && (col+1)<=8){
                System.out.println((row-1)+","+(col+1));
            }
            if ((row+1)<=8 && (col+1)<=8){
                System.out.println((row+1)+","+(col+1));
            }
        }
        input.close();
    }
}
