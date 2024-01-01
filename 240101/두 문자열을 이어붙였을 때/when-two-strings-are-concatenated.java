import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.next();
        String str2 = sc.next();
        
        if(str1.equals(str2)){
            System.out.println(true);
        }
        else
            System.out.println(false);
    }
}