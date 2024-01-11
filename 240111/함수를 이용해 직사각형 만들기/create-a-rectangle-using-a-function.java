import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        print(n, m);

    }
    public static void print(int a, int b){
        for(int i = 0; i<a; i++){
            for(int j =0; j<b; j++){
                System.out.print(1);
            }
            System.out.println();
        }
    }
}