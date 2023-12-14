import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n < m){
            System.out.print(1+" ");
        }
        else{
            System.out.print(0+" ");
        }

        if (n == m){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}