import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = 0;
        for (int i = n; i <=m; i++){
            int cnt = 0;

            for(int j = 1; j<=i; j++){
                if(i % j == 0){
                    cnt += 1;
                }

            }
            if (cnt == 3){
                answer+=1;
            }
        }
        System.out.println(answer);

    }
}