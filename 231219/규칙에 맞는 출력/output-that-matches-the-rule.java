import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n;
        for (int i =0; i < n; i++){
            cnt = n-i;
            for(int j = 0; j <= i; j++){
                System.out.print(cnt+" ");
                cnt++;
            }


            System.out.println();
        }

    }
}