import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        int n = sc.nextInt();
//        int m = sc.nextInt();
        while(n > 1){
            n /= cnt;
            cnt++;
        }

        System.out.println(cnt-1);
    }
}