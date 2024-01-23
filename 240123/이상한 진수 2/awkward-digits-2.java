import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = new char[10];
        arr = str.toCharArray();
        boolean k = true;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != '1'){
                k = false;
            }
        }
        int num = 0;
        if(k){
            arr[str.length()-1] = '0';

            for(int i = 0; i < str.length(); i++)
                num = num * 2 + (arr[i] -'0');
        }else{
            for(int i=0; i<str.length(); i++){
                if(arr[i] == '0'){
                    arr[i] = '1';
                    break;
                }
            }
            for(int i = 0; i < str.length(); i++)
                num = num * 2 + (arr[i] -'0');

        }
        System.out.println(num);
        
    }

}