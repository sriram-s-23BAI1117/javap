import java.io.*;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("file2.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        for (int i=65;i<75;i++){
            bout.write(i);
        }
        byte[] b = {75,76,77,78,79,80};
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
    }
}
