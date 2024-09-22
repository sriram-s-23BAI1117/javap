class Helper1{
    static int Multiply1(int a, int b){
        return a*b;
    }
    static int Multiply1(int a, int b, int c){
        return a*b*c;
    }
}

public class PolyEx2 {
    public static void main(String[] args) {
        System.out.println(Helper1.Multiply1(2, 4));
        System.out.println(Helper1.Multiply1(2, 7, 3));
    }
}
