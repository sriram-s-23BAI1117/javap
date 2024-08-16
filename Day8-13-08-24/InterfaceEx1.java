interface Animal {
    public void animalSound();
    public void sleep();
}
class Pig implements Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
    public void sleep(){
        System.out.println("Zzz");
    }
}

public class InterfaceEx1 {
    public static void main(String[] args) {
        Pig mPig = new Pig();
        mPig.animalSound();
        mPig.sleep();
    }
}


