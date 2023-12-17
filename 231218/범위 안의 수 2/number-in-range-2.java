import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int cnt = 0;
        
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if (n>=0&&n<=200){
                sum += n;
                cnt+=1;
            }
            
        }


        System.out.print(sum+" ");
        System.out.printf("%.1f", (float)sum/cnt);

    }
}