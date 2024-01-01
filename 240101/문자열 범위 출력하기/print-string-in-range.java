import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        for(int i = 2; i<10; i++){
            System.out.print(str.charAt(i));
        }
    }
}