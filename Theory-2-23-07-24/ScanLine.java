import java.util.Scanner;

public class ScanLine {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        System.out.println("Enter username: ");
        userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
        myObj.close();
    }
}


