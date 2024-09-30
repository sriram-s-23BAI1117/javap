class OuterClass12{
    int x = 10;

    class InnerClass{
        public int myInnerMethod(){
            return x;
        }
    }
}

public class PolyEx4 {
    public static void main(String[] args) {
        OuterClass12 myOuter = new OuterClass12();
        OuterClass12.InnerClass myInner = myOuter.new InnerClass();

        System.out.println(myInner.myInnerMethod());
    }
}


