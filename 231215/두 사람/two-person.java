import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char a2 = sc.next().charAt(0);
        int b = sc.nextInt();
        char b2 = sc.next().charAt(0);


        if ((a>=19 || b>= 19) && (a2 == 'M' || b2 == 'M')){
            if( a2 == 'M' || b2 == 'M' ){
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