import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 65;
        for (int i =1; i <= n; i++){

            for(int j = 1; j <=i; j++){
                System.out.print((char)num);
                num++;
                if(num == 91){
                    num = 65;
                }

            }
            System.out.println();

        }

    }
}