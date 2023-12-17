import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
//
        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            char k = sc.next().charAt(0);

            System.out.println(n*m);
            if (k == 'C'){
                break;
            }
        }

    }
}