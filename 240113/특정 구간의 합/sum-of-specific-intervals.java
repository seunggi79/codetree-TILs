import java.util.Scanner;

public class Main {

    public static void print(int[] arr, int[][] arr2, int m) {

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = arr2[i][0]; j <= arr2[i][1]; j++) {

                sum += arr[j-1];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[][] arr2 = new int[100][100];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<m; i++){
            for(int j =0; j<2; j++){
                arr2[i][j] = sc.nextInt();
            }

        }
        print(arr, arr2, m);

    }

}