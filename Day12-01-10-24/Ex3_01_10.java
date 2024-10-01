import java.util.Scanner;

class Pizza{
    int type;
    int rad;
    int n;
    String[] name;
    int[] costph;
    int nr;
    String[] namer;
    int[] reqq;
    double total_cost;
    final double pi = 3.14;
    public Pizza(){
        Scanner input = new Scanner(System.in);
        type = Integer.parseInt(input.nextLine());
        rad = Integer.parseInt(input.nextLine());
        nr = Integer.parseInt(input.nextLine());
        namer = new String[nr];
        reqq = new int[nr];
        for (int i=0;i<nr;i++){
            namer[i] = input.nextLine();
            reqq[i] = Integer.parseInt(input.nextLine());
        }
        n = Integer.parseInt(input.nextLine());
        name = new String[n];
        costph = new int[n];
        for (int i=0;i<n;i++){
            name[i] = input.nextLine();
            costph[i] = Integer.parseInt(input.nextLine());
        }
        input.close();
    }
    public double calculateCost(){
        if(type == 0){
            total_cost+=50;
        }
        else{
            total_cost+=100;
        }
        double ing_cost=0;
        for (int i=0;i<nr;i++){
            for (int j=0;j<n;j++){
                if (namer[i].equalsIgnoreCase(name[j])){
                    ing_cost+=(reqq[i]*((costph[j])/100.0));
                }
            }
        }
        total_cost += (pi*rad*rad*(ing_cost));
        return total_cost;
    }
}

public class Ex3_01_10 {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.printf("%.2f\n",pizza.calculateCost());
    }
}
