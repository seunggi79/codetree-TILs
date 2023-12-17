import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            
            }
            else{
                if ((i < 10 && i == 5) || ( i>=10 &&i < 100 && i % 10 == 5) || (i >= 100 && (i % 100)%10 == 5)) {
                    continue;
                }
                else {
                    if (i % 3 == 0 && i % 9 != 0) {
                        continue;
                    }
                    else {
                        System.out.print(i + " ");

                    }
                }
            }

        }
    }
}