import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i =0; i<n; i++){
            for (int j = 0; j<n-i; j++){
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}