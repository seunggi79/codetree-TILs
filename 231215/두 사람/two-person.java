import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String a2 = sc.next();
        int b = sc.nextInt();
        String b2 = sc.next();


        if (a>=19 || b>= 19){
            if( a2.equals('M') || b2.equals('M') ){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        else{
            System.out.println(0);
        }

    }
}