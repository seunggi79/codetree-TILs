import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = n; i <=m;){
            System.out.print(i + " ");
            if (i % 2 != 0){
                i *= 2;
            }else {
                i += 3;
            }



        }


    }
}