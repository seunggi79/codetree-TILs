import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for (int i =0; i < n; i++){

            for(int j = 1; j <= 2*i; j++){
                System.out.print(" ");

            }
            for(int j = 0; j < n- i; j++){
                System.out.print(cnt+" ");
                cnt++;
                if(cnt ==10)
                    cnt = 1;
            }

            System.out.println();
        }

    }
}