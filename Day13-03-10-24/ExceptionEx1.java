public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
            data = data + 1;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code...");
    }
}