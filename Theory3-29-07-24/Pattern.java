public class Pattern {
    public static void main(String[] args) {

        int n1=20,n2 = 3*(n1)-2;
        for (int i=0;i<n1;i++){
            System.out.print("*");
            for (int j=1;j<n2-1;j++){
                if (i==0){
                    System.out.print("*");
                }
                else if (i==n1-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
}
