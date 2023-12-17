import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        int n = sc.nextInt();
        while( n != 1){
            cnt += 1;
            if ( n % 2 == 0){
                n/=2;
            }
            else {
                n *= 3;
                n += 1;
            }
        }
        System.out.println(cnt);
    }
}