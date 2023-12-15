import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        if (b >= 19){
            if( a == 0){
                System.out.println("MAN");
            }
            else{
                System.out.println("WOMAN");
            }
        }
        else{
            if( a == 0){
                System.out.println("BOY");
            }
            else{
                System.out.println("GIRL");
            }
        }
    }
}