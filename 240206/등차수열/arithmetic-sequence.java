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
        int[] a = new int[n];

        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int cnt =0;
        for(int i=0; i<n; i++){
            for(int k = 1; k<= 100; k++){
                for(int j =i+1; j<n; j++){
                    if(a[j] + a[i] == 2*k){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);

    }
}