import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 각 자리 자물쇠의 차이가 2이하면 자물쇠는 열림
        int cnt = 0;
        for(int i =a+3; i<=6; i++){
            
            for(int j=b+3; j<=6; j++){

                for(int k=c+3; k<=6; k++){
                    cnt++;

                }
            }
        }
        System.out.println(n*n*n - cnt);
    }
}