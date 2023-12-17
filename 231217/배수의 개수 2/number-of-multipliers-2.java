import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        int cnt =0;
        for (int i = 1; i <=10; i++){
            int m = sc.nextInt();

            if(m % 2 != 0){
                cnt += 1;
            }

        }
        System.out.println(cnt);

    }

}