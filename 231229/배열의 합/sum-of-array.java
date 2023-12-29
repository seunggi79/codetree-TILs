import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        for(int i =0; i<4; i++){
            int sum =0;
            for(int j=0; j<4; j++){
                int val = sc.nextInt();
                sum += val;
            }
            System.out.println(sum);
        }


    }
}