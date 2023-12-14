import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double a = sc.nextDouble();
        double c = sc.nextDouble();


        System.out.print((int)(n+a+c) + "\n" + (int)(n+c+a)/3);


    }
}