import java.util.Scanner;

class AP {
    int f, d;

    int term(int n) {
        int an = (f + (n - 1) * d);
        return an;
    }

    int ar_equals_k(int k) {
        for (int i = 1; term(i) <= k; i++) {
            if (term(i) == k) {
                return i;
            }
        }
        return 0;
    }

    int abs_diff(int p, int q) {
        return (term(q) - term(p));
    }
}

public class Arithmetic_Progression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AP myAp = new AP();
        myAp.f = input.nextInt();
        myAp.d = input.nextInt();
        int a1 = (myAp.term(input.nextInt()));
        int a2 = (myAp.ar_equals_k(input.nextInt()));
        int a3 = (myAp.abs_diff(input.nextInt(), input.nextInt()));
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        input.close();
    }
}
