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
        int cnt=0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(i == 0 || arr[i] != arr[i-1] ){
                cnt++;
            }
        }
        System.out.println(cnt);

    }


}