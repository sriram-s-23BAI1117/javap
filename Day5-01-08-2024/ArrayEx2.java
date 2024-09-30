class Student12{
    public int roll_no;
    public String name;
    Student12(int roll_no,String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class ArrayEx2 {
    public static void main(String[] args) {
        Student12[] arr = new Student12[5];
        arr[0] = new Student12(1,"aman");
        arr[1] = new Student12(2,"vaibhav");
        arr[2] = new Student12(3,"shikar");
        arr[3] = new Student12(4,"dharmesh");
        arr[4] = new Student12(5,"mohit");
        for (int i=0;i<arr.length;i++){
            System.out.println("Element at "+i+" : "+arr[i].roll_no+" "+arr[i].name);
        }
    }
}


