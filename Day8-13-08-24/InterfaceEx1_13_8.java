interface Animal22 {
    public void animalSound();
    public void sleep();
}
class Pig22 implements Animal22{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
    public void sleep(){
        System.out.println("Zzz");
    }
}

public class InterfaceEx1_13_8 {
    public static void main(String[] args) {
        Pig22 mPig = new Pig22();
        mPig.animalSound();
        mPig.sleep();
    }
}


