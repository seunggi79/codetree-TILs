import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
//
        while(true){
            int n = sc.nextInt();

            
            if(n == 25){
                System.out.println("Good");
                break;
            } else if (n >= 25) {
                System.out.println("Lower");
            }
            else{
                System.out.println("Higher");
            }
        }

    }
}