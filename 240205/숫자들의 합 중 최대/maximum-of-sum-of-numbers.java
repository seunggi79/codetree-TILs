import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static int INT_MAX = Integer.MAX_VALUE;
    public static int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int max = INT_MIN;
        for(int i = n; i<=m; i++){
            String str = Integer.toString(i);
            char[] c = str.toCharArray();
            int sum =0;
            for(int j =0; j<str.length(); j++){
                sum+= c[j] - '0';
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}