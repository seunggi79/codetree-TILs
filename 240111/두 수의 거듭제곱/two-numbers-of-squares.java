import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(print(n,m));


    }
    public static int print(int a, int b) {
        int prod = 1;
        for(int i=0; i<b;i++){
            prod *= a;
        }
        return prod;
    }

}