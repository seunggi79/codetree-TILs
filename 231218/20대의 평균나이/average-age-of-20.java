import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
//
        int sum = 0;
        while(true){
            int n = sc.nextInt();
            
            if (n > 29 || n < 20 ){
                break;
            }
            sum += n;
            cnt += 1;
        }
        System.out.printf("%.2f",(float)sum/cnt);
    }
}