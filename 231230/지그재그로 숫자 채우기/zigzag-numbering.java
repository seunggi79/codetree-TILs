import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int[][] arr = new int[n][m];
        for(int i =0; i<n; i++) {
            for (int j = 0; j <m; j++) {
                arr[i][j] = cnt;
                cnt++;
            }
        }
        for(int i =0; i<n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(arr[j][i]);
                
            }
            System.out.println();
        }
    }
}