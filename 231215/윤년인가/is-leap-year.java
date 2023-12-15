import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a % 4 == 0){

            if(a % 100 == 0){
                if (a % 400 == 0) {
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }
        }
        else{
            System.out.println("false");
        }
    }
}