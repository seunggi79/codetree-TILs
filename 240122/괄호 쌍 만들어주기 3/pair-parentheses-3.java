import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int cnt = 0;
        int i;
        for(i=0; i<str.length(); i++){

            if(c[i] == '('){
                for(int j = i; j<str.length(); j++){
                    if(c[j] == ')'){
                        cnt++;
                    }
                }

            }
        }
        System.out.println(cnt);

    }

}