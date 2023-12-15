import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        while (n >= m){
            if (n % 2 == 0){
                System.out.print(n + " ");

            }

            n-=2;
        }
        


    }
}