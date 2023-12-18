import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        boolean satisfied= false;

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = n; i<=m; i++){
            if(1920 % i == 0 && 2880 % i == 0){
                satisfied = true;
            }
        }
        if(satisfied){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

    }
}