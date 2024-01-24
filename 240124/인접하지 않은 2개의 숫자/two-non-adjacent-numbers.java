import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = INT_MIN;
        for(int i=0; i<n; i++){
            int answer = 0;
            for(int j =0; j<n; j++){
                if(i + 1 != j && i-1 != j && i != j){
                    if(answer < arr[i]+arr[j])
                        answer = arr[i] + arr[j];
                }
            }
            ans = Math.max(ans, answer);

        }
        System.out.println(ans);
    }
}