import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = n%m;
        System.out.print(n/m+".");
        for(int i = 1; i <= 20; i++){
            System.out.print(k * 10 / m);
            k = k * 10 % m;
        }


    }
}