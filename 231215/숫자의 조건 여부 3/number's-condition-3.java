import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        if (a % 13 ==0 || a % 19 == 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }



    }
}