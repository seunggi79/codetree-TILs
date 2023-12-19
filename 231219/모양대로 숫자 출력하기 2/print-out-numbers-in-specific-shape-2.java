import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i =1; i <=n; i++){
            for(int j=1; j <= n; j++){
                cnt +=2;
                System.out.print(cnt +" ");
                if(cnt == 8){
                    cnt = 0;
                }
            }
            System.out.println();
        }
    }
}