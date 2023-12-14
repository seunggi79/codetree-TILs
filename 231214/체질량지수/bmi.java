import java.util.Scanner;


public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();


        System.out.println((a*10000) / (n*n));
        if (n >= 25){
            System.out.println("Obesity");
        }

    }
}