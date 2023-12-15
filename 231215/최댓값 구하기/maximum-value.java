import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = -100;
        if (max <= a){
            max = a;
        }
        if (max <= b){
            max = b;
        }
        if (max <= c){
            max = c;
        }
        System.out.println(max);
    }
}