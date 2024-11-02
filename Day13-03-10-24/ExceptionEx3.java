public class ExceptionEx3 {
    public static void main(String[] args) {
        int i = 50;
        int j = 0;
        int data = 0;
        data = data + 1;
        try {
            data = i / j;
        } catch (ArithmeticException e) {
            System.out.println(i / (j + 2));
        }
    }
}
