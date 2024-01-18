import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        if(11 > a){
            System.out.println(-1);
            System.exit(0);
        }
        if(11 > b&& 11<=a){
            System.out.println(-1);
            System.exit(0);
        }
        if(11 > c&& 11<=a && 11<=b){
            System.out.println(-1);
            System.exit(0);
        }

        System.out.println((a-11)*24*60 + (b-11) * 60+(c-11));

    }

}