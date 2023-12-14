import java.util.Scanner;


public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        
        if (n > m){
            System.out.println(n *m);
        }
        else{
            System.out.println(m/n);
        }

    }
}