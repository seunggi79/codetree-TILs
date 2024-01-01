import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String str3 = str1.substring(0,2)+ str2.substring(2);
        System.out.println(str3);
    }
}