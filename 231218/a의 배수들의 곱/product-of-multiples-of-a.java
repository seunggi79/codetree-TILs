import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int prod =1;
        
        for (int i = 1; i<=m; i++){
            if (i % n == 0){
                prod *= i;
            }
        }

        System.out.print(prod);

    }
}