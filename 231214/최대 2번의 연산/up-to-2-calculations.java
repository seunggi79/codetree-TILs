import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0){
            n /= 2;
        }
        if (n % 2 != 0){
            n += 1;
            n /= 2;
            
        }
        System.out.println(n);
    }
}