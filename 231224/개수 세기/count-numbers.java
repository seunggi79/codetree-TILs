import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[n];
        for(int i =0; i<10; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == m){
                cnt += 1;
            }
        }
        System.out.println(cnt);

    }
}