class OuterClass11{
    int x = 10;

    static class InnerClass11{
        int y = 5;
    }
}

public class PolyEx3_13_8 {
    public static void main(String[] args) {
        OuterClass11.InnerClass11 myInner = new OuterClass11.InnerClass11();
        System.out.println(myInner.y);
    }
}


