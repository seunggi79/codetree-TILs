import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    
        int min = 101;
        if (min > a){
            min = a;
        }
        if (min > b){
            min = b;
        }
        if (min > c){
            min = c;
        }

        System.out.println(min);

    }
}