public class ExceptionEx2 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
            data = data - 1;
        } catch (ArithmeticException e) {
            System.out.println("Can't be divided by zero");
        }
    }
}
