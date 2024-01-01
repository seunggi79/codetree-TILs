import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char[] arr = str1.toCharArray();
        arr[1] = 'a';
        str1 = String.valueOf(arr);
        System.out.println(str1);
    }
}