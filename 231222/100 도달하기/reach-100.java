import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = n;
        for(int cnt =2; arr[i]<=100;){
            arr[i] = arr[i-2] + arr[i-1];
            cnt++;
        }
        
        for(int i =0; i<cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}