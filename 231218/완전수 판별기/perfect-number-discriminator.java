import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int sum =0;
        
        for (int i = 1; i<n; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        if(n == sum){
            System.out.println('P');
        }
        else {
            System.out.println("N");
        }
        
    }
}