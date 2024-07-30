import java.util.ArrayList;
import java.util.Scanner;

public class IIILargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        System.out.println("Enter the elements of the array");
        for (int i=0;i<n;i++){
            arr.add(input.nextInt());
        }
        int n1=0,n2=0,n3=0;
        for (int i=0;i<n;i++){
            int num = arr.get(i);
            if (num>n1){
                n3=n2;
                n2=n1;
                n1 = num;
            }
            else if (num>n2){
                n3=n2;
                n2=num;
            }
            else if (num>n3){
                n3=num;
            }
        }
        System.out.println("The third largest number: "+n3);
        input.close();
    }
}


