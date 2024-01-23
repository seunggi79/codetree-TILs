import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[100];
        int[] y1 = new int[100];

        for(int i=0; i<n; i++){
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
        }

        int max = -1000;
        int sum = 0;
        int maxIdx = 0;
        for(int i=0; i<n-1; i++){
            if(Math.abs(x1[i] - x1[i+1]) + Math.abs(y1[i] - y1[i+1]) > max){
               max =  Math.abs(x1[i] - x1[i+1]) + Math.abs(y1[i] - y1[i+1]);
               maxIdx = i+1;
            }
        }
        x1[maxIdx] = x1[maxIdx-1];
        y1[maxIdx] = y1[maxIdx-1];
        
        for(int i=0; i<n-1; i++){
            sum +=  Math.abs(x1[i] - x1[i+1]) + Math.abs(y1[i] - y1[i+1]);
        }
        System.out.println(sum);
        
    }

}