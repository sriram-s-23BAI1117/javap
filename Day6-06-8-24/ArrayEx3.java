public class ArrayEx3{
    public static void main(String[] args) {
        Student[] myStudents = new Student[]{new Student("Dharma"),new Student("Sanvi"),
                               new Student("Rupa"),new Student("Ajay")};
        for (Student m:myStudents){
            System.out.println(m);
        }
    }
}

class Student{
    public String name;
    Student(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}


