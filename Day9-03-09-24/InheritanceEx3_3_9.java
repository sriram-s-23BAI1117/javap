class Animal11 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog11 extends Animal11 {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat11 extends Animal11 {
    void meow() {
        System.out.println("meowing...");
    }
}

public class InheritanceEx3_3_9 {
    public static void main(String[] args) {
        Cat11 c = new Cat11();
        c.meow();
        c.eat();
    }
}
