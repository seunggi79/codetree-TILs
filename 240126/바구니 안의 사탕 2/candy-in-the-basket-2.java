import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[1000];
        int[] arr2 = new int[1000];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            arr2[i] = sc.nextInt();

        }

        int ans = 0;
        for(int i=0; i<100; i++){
            int sum = 0;
            for(int j = i-m; j<=i+m; j++){
                if(j<0){
                    continue;
                }
                for(int k = 0; k<n; k++){
                    if(arr2[k] == j){
                        sum+=arr[k];
                        break;
                    }
                }
            }
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }
}