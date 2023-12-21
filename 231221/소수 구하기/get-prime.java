import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <=n; i++){
            boolean swich = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    swich = false;
                }
            }
            if (swich){
                System.out.print(i+" ");
            }
        }


    }
}