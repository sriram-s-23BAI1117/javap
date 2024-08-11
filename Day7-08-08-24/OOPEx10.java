public class OOPEx10 {
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod();
        OOPEx10 myObj = new OOPEx10();
        myObj.myPublicMethod();
    }
}


