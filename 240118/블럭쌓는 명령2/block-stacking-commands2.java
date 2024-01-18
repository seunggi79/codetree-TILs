import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] =0;
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j=0; j<n; j++){
                if(j>=a-1 && j<=b-1){
                    arr[j] += 1;
                }

            }
        }
        int cnt =0;
        for(int i=0;i<n;i++){
            if(arr[i] >= cnt){
                cnt = arr[i];
            }
        }
        System.out.println(cnt);
    }

}