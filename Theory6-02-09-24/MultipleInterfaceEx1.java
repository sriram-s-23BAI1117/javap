interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void my2ndMethod();
}

interface ThirdInterface{
    public void my3rdMehtod();
}

class DemoClass implements FirstInterface,SecondInterface,ThirdInterface{
    public void myMethod(){
        System.out.println("Some text..");
    }
    public void my2ndMethod(){
        System.out.println("Some other text from interface 2..");
    }
    public void my3rdMehtod(){
        System.out.println("Some text from 3rd interface");
    }
}

public class MultipleInterfaceEx1{
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.my2ndMethod();
        myObj.my3rdMehtod();
    }
}