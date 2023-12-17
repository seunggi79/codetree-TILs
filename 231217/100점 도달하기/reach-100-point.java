import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i<=100; i++){
            if (i >= 90){
                System.out.print('A');
                System.out.print(" ");
            }
            else if (i >= 80){
                System.out.print('B');
                System.out.print(" ");

            }
            else if (i >= 70){
                System.out.print('C');
                System.out.print(" ");

            }
            else if (i >= 60){
                System.out.print('D');
                System.out.print(" ");

            }
            else {
                System.out.print('F');
                System.out.print(" ");

            }

        }


    }
}