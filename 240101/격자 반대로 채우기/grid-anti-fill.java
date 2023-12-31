import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[100][100];
        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {


                if ( (n-1) % 2 != i % 2) {
                    arr[n-j-1][i] = cnt;
                    cnt++;

                }
                else {

                    arr[j][i] = cnt;
                    cnt++;

                }
            }

        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}