import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 0;

        for(int i =0; i <str.length(); i++){
            num= num*2 + (str.charAt(i) - '0');
        }

        num *= 17;
        int cnt = 0;
        int[] arr = new int[20];
        while(true){
            if(num < 2){
                arr[cnt++] = num;
                break;
            }

            arr[cnt++] = num%2;
            num/=2;
        }
        for(int i = cnt-1; i>=0; i--){
            System.out.print(arr[i]);
        }


    }

}