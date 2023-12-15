import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) {
            if (a == 2){
                System.out.println(28);
            }
            else{
                if(a >= 8){
                System.out.println(31);
                }
                System.out.println(30);
            }
        }
        else{

            if(a >= 8){
                System.out.println(30);
            }
            else{
                System.out.println(31);

            }
        }

    }
}