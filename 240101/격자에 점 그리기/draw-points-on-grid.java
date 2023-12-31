import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[100][100];
        int cnt = 1;

        for(int i = 0; i<n; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] =0;

            }
        }

        for(int i=0; i<m; i++){
            int k = sc.nextInt();
            int l = sc.nextInt();
            arr[k-1][l-1] = cnt;
            cnt++;
        }


        for(int i = 0; i<n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j] +" ");

            }
            System.out.println();
        }

    }
}