class Animal2{
    Animal2(){
        System.out.println("aminal is created");
    }
}

class Dog2 extends Animal2{
    Dog2(){
        super();
        System.out.println("dog is created");
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Dog2 d2 = new Dog2();
        d2.getClass();
    }
}
