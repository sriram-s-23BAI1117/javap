import java.util.Scanner;

public class Ex1Day9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for (int i=0;i<len;i++){
            arr[i] = input.nextInt();
        }
        int p=0,n=0,ind=0;
        int[] out = new int[len];
        while (p<len && n <len && ind<len-1){
            while (p<len && arr[p]<0) p++;
            while (n<len && arr[n]>=0) n++;
            out[ind]=arr[p];
            out[ind+1]=arr[n];
            p++;
            n++;
            ind+=2;
        }
        while (p<len && ind<len){
            if(arr[p]>=0) out[ind++]=arr[p];
            p++;
        }
        while (n<len && ind<len){
            if(arr[n]<0) out[ind++]=arr[n];
            n++;
        }
        for (int i=0;i<len;i++){
            System.out.print(out[i]+" ");
        }
        input.close();
    }
}