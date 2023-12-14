import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(a>=b?1:0);
        System.out.println(a>c?1:0);
        System.out.println(b>=d?1:0);
        System.out.println(b>e?1:0);

    }
}