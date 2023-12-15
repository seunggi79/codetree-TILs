import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a2 = sc.nextInt();
        int b = sc.nextInt();
        int b2 = sc.nextInt();


        if ( a>b){
            System.out.println('A');
        } else{
            System.out.println('B');
        }
        if (a == b && a >b) {
            System.out.println('A');

        }
        else{
            System.out.println('B');
        }


    }
}