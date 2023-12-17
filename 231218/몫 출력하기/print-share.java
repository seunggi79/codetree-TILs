import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
//
        while(true){
            int n = sc.nextInt();

            if (n % 2!=0){
                continue;
            }else{
                n /= 2;
                System.out.println(n);
                cnt += 1;
                if(cnt == 3){
                    break;
                }
            }
        }

    }
}