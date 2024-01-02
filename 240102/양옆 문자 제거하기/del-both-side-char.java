import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        str1 = str1.substring(0,2)+str1.substring(3, str1.length()-2)+str1.substring(str1.length()-1);
        System.out.println(str1);
    }
}