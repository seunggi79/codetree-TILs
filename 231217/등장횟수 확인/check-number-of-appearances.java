import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        
        for (int i = 0; i< 5; i++){
            int n = sc.nextInt();
            if(n % 2 == 0){
                cnt += 1;
            }
        }
        System.out.println(cnt);
        
        
    }

}