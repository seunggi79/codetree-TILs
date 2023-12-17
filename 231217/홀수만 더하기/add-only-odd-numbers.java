import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            
            if (m % 2 != 0 && m % 3 ==0){
                sum += m;
            }

        }

        System.out.println(sum);


    }

}