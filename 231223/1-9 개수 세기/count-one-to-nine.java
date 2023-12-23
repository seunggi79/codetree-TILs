import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[11];

        for (int i =1; i<=n; i++){
            int m = sc.nextInt();
            arr[m] += 1;

        }

        for(int i =1; i<= 10; i++){
            System.out.print(arr[i]+"\n");
        }


    }
}