import java.util.StringTokenizer;

public class StrTokenExample4 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Demonstrating methods from String Tokenizer class"," ");
        while (st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
    }
}


