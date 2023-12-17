import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i =1; i<=n; i++){
            if (i % 4 == 0){
                cnt += 1;
            }
            else if (i % 4 == 0 && i % 100 == 0){
                if(i % 400== 0){
                    cnt+=1;
                }
            }


        }
        System.out.println(cnt);

    }

}