class Animal33 { //PolyEx1
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Pig33 extends Animal33{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

class Dog33 extends Animal33{
    public void animalSound(){
        System.out.println("The dog says: bow bow");
    }
}

public class PolyEx1_13_8{
    public static void main(String[] args) {
        Animal33 myAnimal = new Animal33();
        Animal33 myPig = new Pig33();
        Animal33 myDog = new Dog33();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}



