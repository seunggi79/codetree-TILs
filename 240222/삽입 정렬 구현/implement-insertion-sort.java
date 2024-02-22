import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++) {

            while(i >= 0 && arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i--;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

    }
}