import java.io.ObjectStreamClass;
import java.util.ArrayList;

public class ObjectStreamDemo {
    public static void main(String[] args){
        ObjectStreamClass geeks_stream = ObjectStreamClass.lookup(Number.class);
        ObjectStreamClass quiz_stream = ObjectStreamClass.lookupAny(ArrayList.class);
        System.out.println(geeks_stream.forClass());
        System.out.println(quiz_stream.forClass());
    }
}
