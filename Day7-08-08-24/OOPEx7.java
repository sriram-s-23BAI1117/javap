public class OOPEx7 {
    int x = 5;
    public static void main(String[] args) {
        OOPEx7 myObj1 = new OOPEx7();
        OOPEx7 myObj2 = new OOPEx7();
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}


