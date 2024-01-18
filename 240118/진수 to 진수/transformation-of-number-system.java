import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();


        int num = 0;

        for(int i =0; i <str.length(); i++){
            num= num*n + (str.charAt(i) - '0');
        }


        int cnt = 0;
        int[] arr = new int[20];
        while(true){
            if(num < m){
                arr[cnt++] = num;
                break;
            }

            arr[cnt++] = num%m;
            num/=m;
        }
        for(int i = cnt-1; i>=0; i--){
            System.out.print(arr[i]);
        }


    }

}