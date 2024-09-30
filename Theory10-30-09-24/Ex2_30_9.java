import java.util.Scanner;
//palindrome

class Node{
    int data;
    Node next;
    Node(){
        data=0;
        next=null;
    }
    Node(int x){
        data=x;
        next=null;
    }
}

public class Ex2_30_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Node head = new Node();
        Node d = head;
        for (int i=0;i<n;i++){
            Node temp = new Node(input.nextInt());
            d.next = temp;
            d = temp;
        }
        input.close();
        Node copy = new Node();
        for (Node i=head.next; i!=null; i=i.next){
            Node t = new Node();
            t.data=i.data;
            t.next = copy;
            copy = t;
        }
        Node j=head.next;
        Node k=copy;
        while (j!=null && k!=null){
            if (j.data != k.data){
                System.out.println(false);
                return;
            }
            j=j.next;
            k=k.next;
        }
        System.out.println(true);
    }
}
