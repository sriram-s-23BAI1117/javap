public class InheritEx1_2 extends InheritEx1_1{ //car
    private String modelName = "Mustang";
    public static void main(String[] args) {
        InheritEx1_2 myFastCar = new InheritEx1_2();
        myFastCar.honk();
        System.out.println(myFastCar.brand+" "+myFastCar.modelName);
    }
}


