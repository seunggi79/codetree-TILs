import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i = n; i > 0; i--){
            for(int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 0; i<n-1;i++){
            for(int j = n; j > i+1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}