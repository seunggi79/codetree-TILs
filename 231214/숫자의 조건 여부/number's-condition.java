import java.util.Scanner;


public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



        System.out.println((n*n));
        if (n >= 113){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}