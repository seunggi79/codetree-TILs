import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double a = sc.nextDouble();



        System.out.printf("%.2f", (n+a)/(n-a));


    }
}