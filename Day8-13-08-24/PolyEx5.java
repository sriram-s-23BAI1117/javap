abstract class Animal222 {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzz");
    }
}

class Pig2 extends Animal222{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
    public void sleep(){};
}

public class PolyEx5 {
    public static void main(String[] args) {
        Pig2 myPig = new Pig2();
        myPig.animalSound();
        myPig.sleep();
    }
}



