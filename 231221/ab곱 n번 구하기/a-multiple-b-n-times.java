import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i =0; i < n; i++){
            int m = sc.nextInt();
            int k = sc.nextInt();
            int prod = 1;
            for (int j = m; j<=k; j++){
                prod *= j;
            }
            System.out.println(prod);
        }

    }
}