import java.util.StringTokenizer;

public class StrTokenExample5 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day"," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextElement());
        }
    }
}



