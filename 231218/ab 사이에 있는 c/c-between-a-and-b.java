import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        for (int i = n; i<=m; i++){
             if(i % 7 == 0){
                 cnt += 1;
             }
        }
        if(cnt >= 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}