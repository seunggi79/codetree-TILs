import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int prod =1;
        int cnt =0;
        while(cnt < m){
            
            prod *= n;
            cnt++;

        }

        System.out.print(prod);

    }
}