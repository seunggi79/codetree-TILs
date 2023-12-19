import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 9;

        for(int i =1; i <=n; i++){
            for(int j=1; j <= n; j++){

                System.out.print(cnt +" ");
                cnt -=1;
                if(cnt == 0){
                    cnt = 9;
                }
            }
            System.out.println();
        }
    }
}