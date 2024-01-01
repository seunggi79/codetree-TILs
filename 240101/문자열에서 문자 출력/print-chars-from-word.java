import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i =0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }


    }
}