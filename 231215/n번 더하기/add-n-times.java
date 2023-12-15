import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = n;
        for(int i =0; i<=n; i++){
            System.out.println(k+m);
            k += m;
        }


    }
}