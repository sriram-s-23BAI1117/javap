import java.io.*;

public class DataInput_Stream {
    public static void main(String[] args) throws IOException{
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("file.txt"));
        dataOut.writeUTF("hello");
        
        DataInputStream dataIn = new DataInputStream(new FileInputStream("file.txt"));
        while (dataIn.available()>0){
            String k = dataIn.readUTF();
            System.out.println(k+" ");
        }
        dataIn.close();
        dataOut.close();
    }
}
