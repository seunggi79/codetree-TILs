import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n > 0){
            for (int i =0; i < m; i++){

                System.out.print(n);
            }
        }else{
            System.out.println(0);
        }


    }
}