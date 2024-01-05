import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        int min = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            for(int j =i; j< n; j++){
                if(min >= arr[i]-arr[j]){
                    min = arr[i]-arr[j];
                }

            }
        }
        System.out.println(-1*min);
    }
}