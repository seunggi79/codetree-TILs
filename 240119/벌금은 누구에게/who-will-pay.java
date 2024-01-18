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
        int k = sc.nextInt();
        int[] mem = new int[n];
        int[] select = new int[m];
        for(int i=0; i<n;i++){
            mem[i] = 0;
        }

        for(int i=0; i<m; i++){
            select[i] = sc.nextInt();
            mem[select[i] - 1] += 1;

            if(mem[select[i] -1] >= k){
                System.out.println(select[i]);
                System.exit(0);
            }
        }

        System.out.println(-1);
    }


}