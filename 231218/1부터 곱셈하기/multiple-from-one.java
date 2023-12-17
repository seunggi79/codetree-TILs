import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int sum =1;
        int n = sc.nextInt();
//        int m = sc.nextInt();
        for (int i = 1;i<=10;i++){
            sum *= i;
            if (i >= sum&& sum != 1){
                sum = i;
                break;
            }
            
        }

        System.out.println(sum);
    }
}