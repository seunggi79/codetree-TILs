import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum =0;

        for (int i = 0; i<n; i++){
            int m = sc.nextInt();
            sum += m;
            
        }

        System.out.print(sum + " ");
        System.out.printf("%.1f", (float)sum/n);

    }
}