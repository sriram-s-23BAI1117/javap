class Animal111 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog111 extends Animal111 {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog111 extends Dog111 {
    void weep() {
        System.out.println("weeping...");
    }
}

public class InheritanceEx2_3_9 {
    public static void main(String[] args) {
        BabyDog111 d = new BabyDog111();
        d.weep();
        d.bark();
        d.eat();
    }
}
