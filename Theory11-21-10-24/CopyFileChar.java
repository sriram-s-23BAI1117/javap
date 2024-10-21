import java.io.*;

public class CopyFileChar{
    public static void main(String[] args) throws IOException{
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("input_char.txt");
            out = new FileWriter("output_char.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally{
            if ( in != null){
                in.close();
            }
            if( out != null){
                out.close();
            }
        }
    }
}