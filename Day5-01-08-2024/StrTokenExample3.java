import java.util.StringTokenizer;

public class StrTokenExample3 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Demonstrating methods from String Tokenizer class"," ");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}


