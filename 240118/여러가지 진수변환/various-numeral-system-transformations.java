import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[20];
        int cnt =0;

        while(true){
            if(n<2){
                num[cnt] = n;
                break;
            }
            num[cnt] = n%m;
            cnt++;
            n/=m;
        }

        for(int i =cnt; i>=0; i--){
            System.out.print(num[i]);
        }


    }

}