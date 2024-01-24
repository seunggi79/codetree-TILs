import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean k;
        int cnt =0;
        int cnt2 = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i) == '(' && str.charAt(i+1) == '('){
                cnt += 1;
            }

            if(cnt > 0){
                if(str.charAt(i) == ')' && str.charAt(i+1) == ')'){
                    cnt2++;
                }
            }
        }

        System.out.println(cnt*cnt2);
    }

}