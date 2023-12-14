import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        
        if (n >= a){
            System.out.println(n-a);
        }else{
            System.out.println(a-n);
        }

    }
}