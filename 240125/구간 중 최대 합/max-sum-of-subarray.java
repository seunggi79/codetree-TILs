import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int ans = 0;
        for(int i=0; i<n-m; i++){
            int max = 0;
            for(int j=i; j <m + i; j++){
                max += arr[j];

            }
            ans = Math.max(ans, max);
        }
        System.out.println(ans);
    }
}