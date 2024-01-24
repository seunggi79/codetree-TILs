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
        String str = sc.next();
        int cnt =0;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i) == 'C') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == 'O') {
                        for (int k = j + 1; k < str.length(); k++) {
                            if (str.charAt(k) == 'W') {
                                cnt++;

                            }
                        }

                    }
                }
            }
        }
        System.out.println(cnt);
    }
}