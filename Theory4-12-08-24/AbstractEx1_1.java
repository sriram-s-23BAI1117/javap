abstract class AbstractEx1_1 {
    public String fname = "John";
    public int age = 24;
    public abstract void study();
}

class Student1 extends AbstractEx1_1{
    public int graduationYear = 2018;
    public Student1(){}
    public void study(){
        System.out.println("Studying all day long");
    }
}


