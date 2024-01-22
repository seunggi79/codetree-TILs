import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int maxCnt = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n - 2; j++)
                maxCnt = Math.max(maxCnt, arr[i][j] + arr[i][j + 1]+arr[i][j+2]);

        System.out.println(maxCnt);


    }

}