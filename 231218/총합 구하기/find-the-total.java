import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum =0;

        for (int i = n; i<=m; i++){
            
            if(i % 6 ==0 && i % 8 != 0){
                sum += i;
            }
            

        }

        System.out.print(sum );

    }
}