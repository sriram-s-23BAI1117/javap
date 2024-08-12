public class ConstructorEx1{
    int modelYear;
    String modelName;
    public ConstructorEx1(int year,String name){
        modelYear = year;
        modelName = name;
    }

    public void print(){
        System.out.printf("%d %s",modelYear,modelName);
    }

    public static void main(String[] args) {
        int year = 1969;
        String name = "Mustang";
        ConstructorEx1 Ex1 = new ConstructorEx1(year, name);
        Ex1.print();
    }
}

