import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 4 != 0) {
                continue;
            }
            else{
                if ((i / 8) % 2 == 0) {
                    continue;
                }
                else {
                    if ( (i%7) < 4) {
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