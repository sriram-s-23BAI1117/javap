import java.util.Scanner;

class Employee {
    protected String name;
    protected String mobileNumber;
    protected int yearOfJoining;
    protected int age;

    public Employee(String name, String mobileNumber, int yearOfJoining, int age){
        this.mobileNumber = mobileNumber;
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.age = age;
    }

    public void employeeDisplay(){
        System.out.println("Name: "+ name);
        System.out.println("Mobile number: "+ mobileNumber);
        System.out.println("Year of joining: "+ yearOfJoining);
        System.out.println("Age: "+ age);
    }
}

class Manager extends Employee{
    private String department;
    public Manager(String name, String mobileNumber, int yearOfJoining, int age, String department){
        super(name, mobileNumber, yearOfJoining, age);
        this.department = department;
    }
    public void managerDisplay(){
        employeeDisplay();
        System.out.println("Department: "+ department);
    }
}

public class Exercise{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the Manager: ");
        String name = input.nextLine();
        System.out.print("Enter the mobile number of the Manager: ");
        String mobnum = input.nextLine();
        System.out.print("Enter the year of joining of the Manager: ");
        int yoj = input.nextInt();
        System.out.print("Enter the age of the Manager: ");
        int age = input.nextInt();
        System.out.print("Enter the department of the manager: ");
        input.nextLine();
        String depart = input.nextLine();

        Manager myManager = new Manager(name, mobnum, yoj, age, depart);
        myManager.managerDisplay();
        input.close();
    }
}