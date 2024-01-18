import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans =0, cnt = 0;
        for(int i=0; i<n; i++){
            // 부호가 같으면 +1
            if(i >= 1 && arr[i] > arr[i -1])
                cnt++;
            else // 부호가 다른 경우
                cnt = 1;

            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }


}