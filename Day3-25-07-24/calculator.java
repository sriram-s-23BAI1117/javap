import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the required operation: +,-,*,/,^ or 'q' to quit :- ");
            char input =scan.nextLine().charAt(0);
            if (input == 'q'){
                System.out.println("Thank you for using!!");
                break;
            }
            int num1,num2;
            
            switch (input) {
                case '+':
                    System.out.print("Enter the two operands: ");
                    num1 = scan.nextInt();
                    num2 = scan.nextInt();
                    System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
                    break;
                case '-':
                    System.out.print("Enter the two operands: ");
                    num1 = scan.nextInt();
                    num2 = scan.nextInt();
                    System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
                    break;
                case '*':
                    System.out.print("Enter the two operands: ");
                    num1 = scan.nextInt();
                    num2 = scan.nextInt();
                    System.out.printf("%d * %d = %.2f\n",num1,num2,(float)num1*num2);
                    break;
                case '/':
                    System.out.print("Enter the two operands: ");
                    num1 = scan.nextInt();
                    num2 = scan.nextInt();
                    System.out.printf("%d / %d = %.2f\n",num1,num2,(float)num1/num2);
                    break;
                case '^':
                    System.out.print("Enter the two operands: ");
                    num1 = scan.nextInt();
                    num2 = scan.nextInt();
                    System.out.printf("%d ^ %d = %.2f\n",num1,num2,Math.pow(num1, num2));
                    break;
                default:
                    System.out.println("Invalid input. Try again!");
                    break;
            }
            //scan.close();
        }
    }
}


