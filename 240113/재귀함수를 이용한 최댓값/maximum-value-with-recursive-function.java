import java.util.Scanner;

public class Main {
    public static final int MAX = 100;
    public static int[] arr = new int[MAX];
    public static int print(int n) {
        if(n == 0){
             return arr[0];
        }
        if(print(n-1)>arr[n]){
            return print(n-1);
        }else{
            return arr[n];
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(print(n-1));


    }

}