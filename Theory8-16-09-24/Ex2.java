class Animal1{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog1 extends Animal1{
    void eat(){
        System.out.println("eating break...");
    }
    void bark(){
        System.out.println("barking...");
    }
    void work(){
        super.eat();
        eat();
        bark();
    }
}



public class Ex2 {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        d1.work();
    }
}
