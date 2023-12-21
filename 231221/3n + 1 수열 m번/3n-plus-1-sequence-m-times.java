import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <n; i++){
            int m = sc.nextInt();
            int cnt =0;
            for (int j = m; j > 1;){
                if (j %2==0){
                    j /= 2;
                    cnt+=1;
                }
                else {
                    j*=3;
                    j+=1;
                    cnt +=1;
                }
            }
            System.out.println(cnt);
        }

    }
}