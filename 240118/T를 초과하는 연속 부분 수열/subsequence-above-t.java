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
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans =0, cnt = 0;
        int cnt2 =0;
        for(int i=0; i<n; i++){
            // 부호가 같으면 +1


            if(arr[i] > m)
                cnt++;
            else{
                // 부호가 다른 경우
                if(i != 0)
                    cnt = 0;
                cnt2 += 1;
            }

            ans = Math.max(ans, cnt);
        }
        if(cnt2 == n){
            System.out.println(0);
            System.exit(0);
        }

        System.out.println(ans);
    }


}