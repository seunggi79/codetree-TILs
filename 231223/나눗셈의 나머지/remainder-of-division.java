import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[10];

        int sum = 0;
        while (n>1) {
            n /= m;
            arr[n % m] += 1;
        }

        for(int i =0; i<=9; i++){
            sum += arr[i]*arr[i];
        }

        System.out.println(sum);
    }
}