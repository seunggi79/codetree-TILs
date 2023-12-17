import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();


        for (int i = n; i <= m; i++) {
            if( i % 5 == 0){
                sum += i;
            }

        }



    }

}